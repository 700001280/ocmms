package com.ocmms.cmms.file.web;


import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.jfree.util.Log;
import org.json.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ocmms.cmms.base.BasicFileUtil;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.service.api.AssetInventoryRecordService;
import com.ocmms.cmms.service.api.DocumentService;

import io.springlets.data.jpa.domain.EmbeddableImage;

@RestController
public class FileUploadController {

	private static Logger logger = LoggerFactory.getLogger(FileUploadController.class);

	@Value("${ocmms.fileupload.fileLocation}")
	private String fileLocation;

	@Value("${ocmms.fileupload.image.newFormat}")
	private String newFormat;

	@Value("${ocmms.fileupload.image.width}")
	private int width;

	@Value("${ocmms.fileupload.image.height}")
	private int height;

	private EmbeddableImage embeddableImage = new EmbeddableImage();

	@Autowired
	private DocumentService documentService;

	@Autowired
	private EquipmentService equipmentService;

	@Autowired
	private AssetInventoryRecordService assetInventoryRecordService;

	// method for uploading single file
	@RequestMapping(value = "/api/uploadFile", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		String typeAndId = request.getParameter("id");
		String  formId = request.getParameter("formId");
		logger.info("formid:{}", formId);		
		typeAndId = typeAndId.substring(1, typeAndId.length());
		Long id = Long.valueOf(typeAndId.substring(typeAndId.indexOf("/") + 1, typeAndId.length()));
		String type = request.getParameter("type");
		String description = request.getParameter("description");
		AssetInventoryRecord assetInventoryRecord = new AssetInventoryRecord();
		logger.info("id:{},type:{},description:{}", id, type, description);

		if (type.equals("assetsinventoryrecord")) {
			assetInventoryRecord.setCheckDate(Calendar.getInstance());
			assetInventoryRecord.setCheckResult(true);
			assetInventoryRecord.setDescription(description);
			assetInventoryRecord.setEquipment(equipmentService.findOne(id));
			assetInventoryRecord = assetInventoryRecordService.save(assetInventoryRecord);
			logger.info("check saved!");
		}

		File uploadedFile = new File(fileLocation, BasicFileUtil.getSystemDefineFileName().concat(".")
				.concat(BasicFileUtil.getFileExtension(file.getOriginalFilename())));

		try {
			Document document = new Document();
			if (type.equals("equipment")) {
				document.setEquipment(equipmentService.findOne(id));
				document.setDescription(description);
			} else if (type.equals("assetsinventoryrecord")) {
				document.setDescription("盘点照片");
				document.setAssetInventoryRecord(assetInventoryRecord);
			}

			document.setFileName(uploadedFile.getName());
			document.setFileType(BasicFileUtil.getFileExtension(file.getOriginalFilename()));
			document.setUploadDate(Calendar.getInstance());
			uploadedFile.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
			fileOutputStream.write(file.getBytes());
			fileOutputStream.close();

			if (uploadedFile.getName().endsWith("png") || uploadedFile.getName().endsWith("jpg")) {
				embeddableImage.setImage(file.getBytes());
				//document.setImageEncode(embeddableImage.toString());
			}

			documentService.save(document);
			logger.info("upload file info saved!");
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<Object>("failure", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}

	// method for uploading multiple files
	@RequestMapping(value = "/api/uploadmultipleFiles", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadmultipleFile(@RequestParam("files") MultipartFile[] files) {
		FileOutputStream fileOutputStream = null;

		for (MultipartFile multipartFile : files) {

			File uploadedFile = new File(fileLocation, multipartFile.getOriginalFilename());

			try {
				uploadedFile.createNewFile();
				fileOutputStream = new FileOutputStream(uploadedFile);
				fileOutputStream.write(multipartFile.getBytes());
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return new ResponseEntity<Object>("All file Uplaoded succesfully", HttpStatus.OK);
	}

	// method for downloading file
	@RequestMapping(value = "/api/downloadFile/{fileName:.+}", method = RequestMethod.GET)
	public ResponseEntity<Object> apiDownloadFile(@PathVariable String fileName, HttpServletResponse response) {

		String filePath = fileLocation + fileName;
		Path path = Paths.get(filePath);
		Resource resource = null;

		try {
			resource = new UrlResource(path.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		if (resource.exists()) {
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
					.body(resource);

			// return new ResponseEntity<Object>(resource, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("File Not Found ", HttpStatus.OK);
		}
	}

	// method for downloading file
	@RequestMapping(value = "/downloadFile/{fileName:.+}", method = RequestMethod.GET)
	public void downloadFile(@PathVariable String fileName, HttpServletResponse response) {

		String filePath = fileLocation + fileName;
		logger.info(filePath);
		File file = new File(filePath);

		if (file.exists()) {
			if (fileName.endsWith("png")) {
				response.setContentType("application/png");
			} else if (fileName.endsWith("jpg")) {
				response.setContentType("application/jpg");
			} else {
				response.setContentType("application/pdf");
			}

			response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
			try {
				// copies all bytes from a file to an output stream
				InputStream inputStream = new FileInputStream(file);
				// copy it to response's OutputStream
				org.apache.commons.io.IOUtils.copy(inputStream, response.getOutputStream());
				response.flushBuffer();
				// response.getOutputStream().flush();
			} catch (IOException e) {
				System.out.println("Error :- " + e.getMessage());
			}
		} else {
			System.out.println("Sorry File not found!!!!");
		}
	}
		
	}


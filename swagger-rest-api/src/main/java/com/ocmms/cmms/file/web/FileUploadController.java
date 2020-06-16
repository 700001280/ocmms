package com.ocmms.cmms.file.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ocmms.cmms.base.BasicFileUtil;
import com.ocmms.cmms.base.EmbeddableImage;
import com.ocmms.cmms.jwt.controllers.BarCodeInterpreter;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.repository.AssetInventoryRecordRepository;
import com.ocmms.cmms.repository.DocumentRepository;
import com.ocmms.cmms.repository.EquipmentRepository;
import com.ocmms.cmms.repository.ImageDocumentRepository;
import com.ocmms.cmms.repository.MaterialCatalogRepository;

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
	private ImageDocumentRepository imageDocumentRepository;

	@Autowired
	private EquipmentRepository equipmentRepository;

	@Autowired
	private AssetInventoryRecordRepository assetInventoryRecordRepository;

	@Autowired
	private MaterialCatalogRepository materialCatalogRepository;

	// method for uploading single file
	@RequestMapping(value = "/api/uploadFile", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		// Map<String, String[]> parameters = request.getParameterMap();
		// for (String key : parameters.keySet()) {
		// System.out.println(key + " ：" + parameters.get(key).toString());
		// }
		String type = request.getParameter("TYPE");

		File uploadedFile = new File(fileLocation, BasicFileUtil.getSystemDefineFileName().concat(".")
				.concat(BasicFileUtil.getFileExtension(file.getOriginalFilename())));

		try {
			ImageDocument document = new ImageDocument();
			if (type.equals("MTSPIC")) {
				String materialCode = request.getParameter("MTCD");
				Optional<MaterialCatalog> materialCatalog = materialCatalogRepository.findByCode(materialCode);
				// document.setMaterialCatalog(materialCatalog.get());

				document.setDescription(uploadedFile.getName());

				document.setFileName(uploadedFile.getName());
				document.setFileType(BasicFileUtil.getFileExtension(file.getOriginalFilename()));
				document.setUploadDate(Calendar.getInstance());
				uploadedFile.createNewFile();
				FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
				fileOutputStream.write(file.getBytes());
				fileOutputStream.close();
				embeddableImage.setImage(file.getBytes());
				if (materialCatalog.isPresent()) {
					materialCatalog.get().setImage(embeddableImage.resize(800).toString());
					document.setMaterialCatalog(materialCatalogRepository.save(materialCatalog.get()));
				}
				imageDocumentRepository.save(document);
				logger.info("upload file info saved!");
			}
			
			
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
				IOUtils.copy(inputStream, response.getOutputStream());
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

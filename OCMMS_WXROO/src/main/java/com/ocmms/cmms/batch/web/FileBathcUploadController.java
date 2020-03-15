package com.ocmms.cmms.batch.web;

import java.io.IOException;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ocmms.cmms.InitApplication;
import com.ocmms.cmms.batch.purchasedetail.PurchaseDetailJobLauncher;
import com.ocmms.cmms.batch.servicematerialdetail.ServiceMaterialDetailJobLauncher;
import com.ocmms.cmms.file.service.StorageFileNotFoundException;
import com.ocmms.cmms.file.service.StorageService;

@Controller
public class FileBathcUploadController {
	
	private static Logger logger = LoggerFactory.getLogger(FileBathcUploadController.class);

	private final StorageService storageService;

	@Autowired
	private PurchaseDetailJobLauncher purchaseDetailJobLauncher;

	@Autowired
	private ServiceMaterialDetailJobLauncher serviceMaterialDetailJobLauncher;

	@Autowired
	public FileBathcUploadController(StorageService storageService) {
		this.storageService = storageService;
	}

	@GetMapping("/batch/upload")
	public String listUploadedFiles(Model model) throws IOException {

		model.addAttribute("files", storageService.loadAll()
				.map(path -> MvcUriComponentsBuilder
						.fromMethodName(FileBathcUploadController.class, "serveFile", path.getFileName().toString())
						.build().toString())
				.collect(Collectors.toList()));

		return "batch/upload";
	}

	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}

	@PostMapping("/batch/uploadFile")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		storageService.store(file);
		logger.info("save file {}",file.getOriginalFilename());		
		logger.info("batch import data from {}",file.getOriginalFilename());
		
		 this.launchJob( file); 
		
		logger.info("batch import data from {} completed",file.getOriginalFilename());
		
		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return "redirect:/batch/upload";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

	public void launchJob( MultipartFile file) {
		try {

			if (file.getOriginalFilename().toLowerCase().equals("servicematerialdetail.xlsx")) {

				serviceMaterialDetailJobLauncher.launchServiceMaterialDetailJob();

			} else if (file.getOriginalFilename().toLowerCase().equals("purchasedetail.xlsx")) {

				purchaseDetailJobLauncher.launchPurchaseDetailJob();

			}
		} catch (JobParametersInvalidException e) {
			logger.info("JobParametersInvalidException {}",e.getMessage());
			e.printStackTrace();
		} catch (JobExecutionAlreadyRunningException e) {
			logger.info("JobExecutionAlreadyRunningException {}",e.getMessage());
			e.printStackTrace();
		} catch (JobRestartException e) {
			logger.info("JobRestartException {}",e.getMessage());
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			logger.info("JobInstanceAlreadyCompleteException {}",e.getMessage());
			e.printStackTrace();
		}
	}
}
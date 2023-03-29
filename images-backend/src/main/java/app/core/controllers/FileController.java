package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import app.core.services.FileStorageService;

@RestController
public class FileController {

	@Autowired
	private FileStorageService fileStorageService;

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam MultipartFile file) {
		return this.fileStorageService.storeFile(file);
	}

	@GetMapping("/downloadFile/{fileName}")
	public Resource downloadFile(@PathVariable String fileName) {
		Resource resource = this.fileStorageService.loadFileAsResource(fileName);
		System.out.println(resource);
		return resource;
	}

}

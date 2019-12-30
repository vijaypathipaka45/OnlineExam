package com.posidex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.posidex.filebeans.FileStorageService;
import com.posidex.filebeans.UploadFileResponse;

@RestController
public class FileUploadController {

	@Autowired
    private FileStorageService fileStorageService;
	
	@PostMapping("/uploadFile")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
		
		System.out.println("before service");
        String fileName = fileStorageService.storeFile(file);
        System.out.println("after service");

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();
        
        System.out.println("filedownloaduri "+fileDownloadUri+" filename "+fileName);
        
        System.out.println("filetype "+file.getContentType());
        System.out.println("filesize "+file.getSize());

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }
}

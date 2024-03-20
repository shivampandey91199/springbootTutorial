package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadSample {

	@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {

		File Convertfile = new File(
				"C:/Users/Krishna/Desktop/Course/Spring Boots/Documents" + file.getOriginalFilename());
		Convertfile.createNewFile();
		FileOutputStream fout = new FileOutputStream(Convertfile);
		fout.write(file.getBytes());
		fout.close();
		return "File Upload Successfully";
	}

}

package com.codeclan.files_and_folders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.codeclan.files_and_folders.models")
public class FilesAndFoldersApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesAndFoldersApplication.class, args);
	}

}

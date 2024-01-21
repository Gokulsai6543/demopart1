package com.example.demo.controller;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.utitlity.ExcelExtracter;

@RestController
@RequestMapping("/api/excel")
public class SampleApi {
	
	@Autowired
	ExcelExtracter excelExtracter;
	
	@GetMapping("/testapi")
	public ResponseEntity<String> testAPi(){
		return ResponseEntity.ok("test api is working");
	}
	@PostMapping("/upload")
	public ResponseEntity<String> handleFileUpload (@RequestPart("file") MultipartFile file) throws IOException{
		excelExtracter.extractData(file);
		
		return ResponseEntity.ok("exraction done sucessfully");
		
		
	}
	
	@GetMapping("/getalldata")
	public ResponseEntity<String> getAllData(){
		return ResponseEntity.ok("test api is working");
	}
}

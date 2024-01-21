package com.example.demo.utitlity;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.ProfitAndLoss;

import org.apache.poi.ss.usermodel.*;

@Service
public class ExcelExtracter {
	
	public void extractData(MultipartFile file) throws IOException {

        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(2); // Assuming data is in the first sheet

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
            	Row row = rowIterator.next();
            	
            	Iterator<Cell> cellIterator = row.cellIterator() ;
                while(cellIterator.hasNext()) {
                	Cell cell = cellIterator.next();
                	System.out.print(cell+" ");

            }
            System.out.println();
        }

    
    }
		
	}

}

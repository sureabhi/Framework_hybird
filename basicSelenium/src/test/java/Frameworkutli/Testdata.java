package Frameworkutli;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {
	 XSSFSheet sh;
String sheetname="Submit";
	XSSFWorkbook book;
	
	public Testdata() throws Exception {
		String path="D:/basicSelenium/TestData/New Microsoft Office Excel Worksheet.xlsx";
	    // XSSFWorkbook book;
		 book= new XSSFWorkbook(path);
		
		 sh=book.getSheet(sheetname);
	}
	
	
	public   String getCellStringdata(int rowNum,int colNum) throws IOException {
		
		return sh.getRow(rowNum).getCell(colNum).getStringCellValue();
	}	
			
	public double getCellnumericdata(int rowNum,int colNum) throws IOException {
			
		return sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
	          }		
	            
	}



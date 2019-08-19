package utli;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class excelutli {
	
	static String path="D:/basicSelenium/excel/Book1.xlsx";
	static XSSFWorkbook book;
	static XSSFSheet sh;
	
	
	
	public excelutli(String path,String sheetname) throws Exception {
		//path= System.getProperty("user.dir");
		 book= new XSSFWorkbook(path);
		XSSFSheet sh=book.getSheet(sheetname);
	}
		
 public  static int getRowcount() {
	 
	 int rowcount;
	 try {
		book= new XSSFWorkbook(path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		XSSFSheet sh=book.getSheet("sheet1");
	  rowcount=sh.getPhysicalNumberOfRows();
	 System.out.println("Total rowcount"+rowcount);
	 
         
 return rowcount;
 }
 public  static int getColcount() throws IOException {
	 int Colcount;
	 book= new XSSFWorkbook(path);
		XSSFSheet sh=book.getSheet("sheet1");
	  Colcount=sh.getRow(0).getPhysicalNumberOfCells();
	 System.out.println("Total Colcount"+Colcount);
	 return Colcount;
         }
 
 public  static String getCellStringdata(int rowNum,int colNum) throws IOException {
	 String data;
	 book= new XSSFWorkbook(path);
		XSSFSheet sh=book.getSheet("sheet1");
 
		
		 data =sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Stringdata  "+data);
		
		return data;
            }
		public static double getCellnumericdata(int rowNum,int colNum) throws IOException {
			double num;
			book= new XSSFWorkbook(path);
			XSSFSheet sh=book.getSheet("sheet1");
			 
			
			 num =sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("numericdata"+num);
			 return num;
		
              }
}


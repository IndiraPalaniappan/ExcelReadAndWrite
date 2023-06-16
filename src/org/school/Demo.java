package org.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("C:\\Users\\indir\\OneDrive\\Documents\\Book1.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
	}
}

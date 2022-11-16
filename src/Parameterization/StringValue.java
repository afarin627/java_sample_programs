package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String filepath = "/home/ewings/Afreen/Sheet11.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.print(value);
	}

}

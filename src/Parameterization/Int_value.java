package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Int_value {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "/home/ewings/Afreen/paraSheet1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
	double value =WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
		System.out.print(value);

	}

}

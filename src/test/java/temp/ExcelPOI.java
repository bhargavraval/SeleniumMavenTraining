package temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPOI {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\kanerika\\Training\\Selenium\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Data");

		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Last row num: " + lastRowNum);

		XSSFRow row0 = sheet.getRow(0);

		short lastCellNum = row0.getLastCellNum();
		System.out.println("Last column num: " + lastCellNum);

		for (int i = 0; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}

		fis.close();
		sheet.getRow(1).createCell(2).setCellValue("Pass");

		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		workbook.close();

	}

}

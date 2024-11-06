package excelPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		
		List<Map<String,String>> data = readData(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx","Sheet1");
		
		for(Map<String,String> row : data) {
			System.out.println(row);
		}
		System.out.println(data.get(2).get("Password"));

	}
	
	public static List<Map<String,String>> readData (String filePath ,String sheetName){
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
			for(int r=1;r<totalRows;r++) {
				Map<String,String> rowData = new HashMap<String,String>();
				for(int c=0; c<totalColumns;c++) {
					String columnName = sh.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sh.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValue);
				}
				data.add(rowData);
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return data;
	}

}

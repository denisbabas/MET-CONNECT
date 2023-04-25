package utils;

	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtility {

		static Workbook book;
		static Sheet sheet;
		static Row row;
		static Cell cell;
		
		/**
		 * This method create xlsx file 
		 */
		public static void createExcel(String filePath, String sheetName) {
			book = new XSSFWorkbook();
			sheet = book.createSheet(sheetName);
			writeExcel(filePath);
		}
		
		/**
		 * This method open existing xlsx file 
		 */
		public static void openExcel(String filePath) {

			try {
				FileInputStream fis = new FileInputStream(filePath);
				book = new XSSFWorkbook(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * This method get sheet from the existing xlsx file
		 */
		public static void getSheet(String sheetName) {
			sheet = book.getSheet(sheetName);
		}

		/**
		 * This method write in to the xlsx file 
		 */
		public static void writeExcel(String filePath) {
			try {
				FileOutputStream fos = new FileOutputStream(new File(filePath));
				book.write(fos);
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * This method write in to specific row using List of values if we have multiple elements in the list this method will create 
		 * cell ++
		 */
		public static void writeStringRow(List<String> data, int rowIndex) {
			row = sheet.createRow(rowIndex);
			int cellIndex = 0;
			for (String value : data) {
				cell = row.createCell(cellIndex++);
				cell.setCellValue(value);
			}
		}
		

		/**
		 * This method write List of values in the xlsx file creating for every element unique row row++
		 */
		public static void writeList(List<List<String>> data, String FilePath) {
			int rowIndex = 0;
			for (List<String> row : data) {
				writeStringRow(row, rowIndex++);
			}
		  
			writeExcel(FilePath);
		}

		/**
		 * This method write in to specific row using String value
		 */
		public static void writeStringRow(String value, int rowIndex) {
		    row = sheet.createRow(rowIndex);
		    cell = row.createCell(0);
		    cell.setCellValue(value);
		}
		
		
		/**
		 * This method for maps from map to excel
		 */
		
		public static void writeListMap(List<Map<String, String>> data, String FilePath) {
			int rowIndex = 0;
			for (Map<String, String> map : data) {
				row = sheet.createRow(rowIndex++);
				int cellIndex = 0;
				for (String key : map.keySet()) {
					cell = row.createCell(cellIndex++);
					cell.setCellValue(map.get(key));
				}
			}
			writeExcel(FilePath);
		}
		
		/**
		 * This method get row count
		 */
		public static int getRowsCount() {
			return sheet.getPhysicalNumberOfRows();
		}


		/**
		 * This method get colon count
		 */
		public static int getColsCount(int rowNum) {
			return sheet.getRow(rowNum).getPhysicalNumberOfCells();
		}

		

		/**
		 * This method get cell data
		 */
		public static String getCellData(int rowIndex, int colIndex) {
			return sheet.getRow(rowIndex).getCell(colIndex).toString();
		}
		
		/**
		 * This method get cell data double
		 */
		public static double getCellDataDouble (int rowIndex, int colIndex) {
			return sheet.getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		}
		
		/**
		 * This method for maps from excel to list maps
		 */
		public static List<Map<String, String>> excelToListMap(String filePath, String sheet) {

			List<Map<String, String>> list = new ArrayList<>();
			Map<String, String> map;

			openExcel(filePath);
			getSheet(sheet);

			for (int r = 1; r < getRowsCount(); r++) {
				map = new LinkedHashMap<>();

				for (int c = 0; c < getColsCount(r); c++) {

					String key = getCellData(0, c);
					String value = getCellData(r, c);
					map.put(key, value);
				}
				list.add(map);
			}
			return list;
		}
	

	}
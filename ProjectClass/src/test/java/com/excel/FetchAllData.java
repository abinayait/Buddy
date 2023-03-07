package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FetchAllData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream("G:\\Learning\\Abinaya R\\excel\\emailexcel.xlsx");
		Workbook wb=new XSSFWorkbook(fs);
		Sheet s=wb.getSheetAt(0);
		int all_row=s.getPhysicalNumberOfRows();
		for(int i=0;i<all_row;i++) {
			Row r=s.getRow(i);
			int all_cell=r.getPhysicalNumberOfCells();
			for(int j=0;j<all_cell;j++) {
			Cell c=r.getCell(j);
		CellType ct=c.getCellType();
			if(ct.equals(CellType.STRING)) {
				String s1=c.getStringCellValue();
				System.out.println(s1);
			}
			else if(ct.equals(CellType.NUMERIC)) {
				double d=c.getNumericCellValue();
				int k=(int) d;
				String s2=String.valueOf(i);
				System.out.println(s2);
			}
			}
		}
		
		
		
	}

}

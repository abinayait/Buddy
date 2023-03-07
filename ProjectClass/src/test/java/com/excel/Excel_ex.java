package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ex {

	public static void main(String[] args) throws IOException {
		
		File exl=new File("G:\\Learning\\Abinaya R\\excel\\emailexcel.xlsx");
		FileInputStream fs=new FileInputStream(exl);
		
		Workbook wb=new XSSFWorkbook(fs);
		
		Sheet s=wb.getSheetAt(0);
		Row r=s.getRow(3);
//		Column c=s.get
		Cell c=r.getCell(0);
		CellType ctype=c.getCellType();
		if(ctype.equals(CellType.STRING)) {
			String str=c.getStringCellValue();
			System.out.println(str);
		}
		else if(ctype.equals(CellType.NUMERIC)){
			double d=c.getNumericCellValue();
			int n=(int)d;
			String str=String.valueOf(n);
			System.out.println(str);
		}
		
		
		
	}

}

package com.automation.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {


	public static String[][] excelDataProvider() throws NumberFormatException, InterruptedException, IOException {

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\konda\\Desktop\\HTML_Files\\PrimeNumbers.xlsx"));  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		//FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		int i=0;
		
		String [][] excelArray = new String[5][2];
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		    for(Cell cell: row)    //iteration over cell using for each loop  
		    {   
				     if(i!=0)
				     {
				    	 if(cell.getColumnIndex()==0)
				    	   excelArray[i-1][0] = String.valueOf((int)cell.getNumericCellValue());
				    	 if(cell.getColumnIndex()==1)
			           	  excelArray[i-1][1] = String.valueOf((boolean)cell.getBooleanCellValue());
			         }  
		    }  
		    i++; 
		} 

        return excelArray;
	}
}

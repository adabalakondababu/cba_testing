package com.automation.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelPracticeTest {

	WebDriver driver;

	@Test
	public static Object[][] practiceTest() throws NumberFormatException, InterruptedException, IOException {

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\konda\\Desktop\\HTML_Files\\TestExcel.xlsx"));  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		    for(Cell cell: row)    //iteration over cell using for each loop  
		    {  
		         switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		         {  
			         case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
				     //getting the value of the cell as a number    
		             break;  
		
			         case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
			         //getting the value of the cell as a string    
		             break;  
		          }  
		    }  
		}
		return null; 
	}
}

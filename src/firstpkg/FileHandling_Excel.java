package firstpkg;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel 
{

	public static void readexceldata() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\TestData\\learnexcel.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("tool");
		
		int nr = sh1.getPhysicalNumberOfRows();  //4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh1.getRow(i);  //i=0
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.NUMERIC)
				{
					System.out.print(col.getNumericCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "    ");
				}
				
				/*
				else if(col.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(col))
				{
				
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-mon-yyyy");
					
					dateformat.format(col.getDateCellValue());
					
					System.out.print(dateformat.format(col.getDateCellValue())+ "     ");
					
					
				}
				*/
			}
			
			System.out.println();
			
		}
		
		/*
		//first row
		
		XSSFRow row1 = sh1.getRow(0);
		
		XSSFCell col1 = row1.getCell(0);;
		System.out.print(col1.getStringCellValue() + "    ");
		
		XSSFCell col2 = row1.getCell(1);
		System.out.print(col2.getNumericCellValue() + "    ");
		
		XSSFCell col3 = row1.getCell(2);
		System.out.print(col3.getBooleanCellValue() + "    ");
		
		XSSFCell col4 = row1.getCell(3);
		System.out.print(col4.getDateCellValue() + "    ");
		
		System.out.println();
		
		//second row
		
		XSSFRow row2 = sh1.getRow(1);
		
		XSSFCell col21 = row2.getCell(0);
		System.out.print(col21.getStringCellValue() + "    ");
		
		XSSFCell col22 = row2.getCell(1);
		System.out.print(col22.getNumericCellValue() + "    ");
		
		*/
	}
	
	public static void main(String[] args) throws Exception {
		readexceldata();
	}
	
}

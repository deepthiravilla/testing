package week4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[]args)throws IOException
	{
		//open workbook
		XSSFWorkbook wBook=new XSSFWorkbook("C:\\Users\\user\\Desktop\\EXCEL-SELE-CREATE.xlsx");
		//gotosheet
		//XSSFSheet sheet=wBook.getSheetAt(0);two methods 
		XSSFSheet sheet=wBook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		//sheet.getPhysicalNumberOfRows();
		
		int columnCount=sheet.getRow(0).getLastCellNum();
		//goto row
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			//go to cell
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell=row.getCell(j);
				//read the data
				String data=cell.getStringCellValue();
				System.out.println(data);
				
			}
		}
		
		
		}

}




package utils;


	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		
		public class ReadExcel {
			public String[][] getData(String sheetname)throws IOException {
				// TODO Auto-generated method stub
				XSSFWorkbook wBook=new XSSFWorkbook("./data/Book1.xlsx");
				XSSFSheet sheet = wBook.getSheet("Sheet1");
				int lastRowNum = sheet.getLastRowNum();
				short columnCount = sheet.getRow(0).getLastCellNum();
				String[][] data=new String[lastRowNum][columnCount];
				for(int i=1;i<=lastRowNum;i++)
				{
					XSSFRow row=sheet.getRow(i);
					for(int j=0;j<columnCount;j++)
					{
						XSSFCell cell = row.getCell(j);
						 data[i-1] [j]= cell.getStringCellValue();
						System.out.println(data);
					
					}
				}wBook.close();
				return data;
				

			}

		}


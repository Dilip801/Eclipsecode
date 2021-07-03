import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("E:\\mission automation\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
			    Iterator<Row> rows	=sheet.iterator();
			    Row firstrow= rows.next();
			    Iterator<Cell> ce= firstrow.cellIterator();
			    int k=0;
			    int collumn = 0 ;
			    while(ce.hasNext()) 
			    {
			    	Cell value = ce.next();
			    	if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
			    	{
			    		collumn =k;
			    	}
			    	k++;
			    }
			    System.out.println(collumn);
			    
			}
		}
		

	}

}

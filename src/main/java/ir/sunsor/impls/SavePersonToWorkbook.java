package ir.sunsor.impls;

import ir.sunsor.interfaces.SaveObjectToWorkbook;
import ir.sunsor.objects.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class SavePersonToWorkbook implements SaveObjectToWorkbook<List<Person>, Workbook> {

    public Workbook save(List<Person> people, File file) {

            OutputStream outputStream = null;
            Workbook workbook = new XSSFWorkbook();
            try{
                outputStream = new FileOutputStream(file);
                fillHeading(workbook);
                Sheet sheet = workbook.getSheetAt(0);
                int rowCount = 1;
                for (Person person : people){
                    Row nextRow = sheet.createRow(++rowCount);
                    Cell cell0 = nextRow.createCell(0);
                    cell0.setCellValue(person.getId());
                    Cell cell1 = nextRow.createCell(1);
                    cell1.setCellValue(person.getFirstName());
                    Cell cell2 = nextRow.createCell(2);
                    cell2.setCellValue(person.getLastName());
                    Cell cell3 = nextRow.createCell(3);
                    cell3.setCellValue(person.getPhoneNumber());
                }
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
                return workbook;
            }catch (Exception e){
                System.out.println(e.getStackTrace());
                return null;
            }
    }

    public static void fillHeading(Workbook workbook){
        Sheet sheet = workbook.createSheet();
        Row row = sheet.createRow(1);
        Cell cellId = row.createCell(0);
        cellId.setCellValue("id");
        Cell cellFirstName = row.createCell(1);
        cellFirstName.setCellValue("first name");
        Cell cellLastName = row.createCell(2);
        cellLastName.setCellValue("last name");
        Cell cellPhoneNumber = row.createCell(3);
        cellPhoneNumber.setCellValue("phone number");
    }
}

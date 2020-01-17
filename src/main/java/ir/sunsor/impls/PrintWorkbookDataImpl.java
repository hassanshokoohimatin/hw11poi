package ir.sunsor.impls;

import ir.sunsor.interfaces.PrintWorkbookData;
import ir.sunsor.objects.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintWorkbookDataImpl implements PrintWorkbookData{
    @Override
    public void print(Workbook workbook) {
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()){
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.iterator();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                if (cell != null){
                    System.out.printf("%s\t\t\t\t\t",cell.getStringCellValue());
                }
            }
            System.out.println();
        }
    }
}

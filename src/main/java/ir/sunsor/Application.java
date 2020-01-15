package ir.sunsor;

import ir.sunsor.impls.ConstructPerson;
import ir.sunsor.impls.CreateFileImpl;
import ir.sunsor.impls.PrintWorkbookDataImpl;
import ir.sunsor.impls.SavePersonToWorkbook;
import ir.sunsor.interfaces.ConstructObject;
import ir.sunsor.interfaces.CreateFile;
import ir.sunsor.interfaces.PrintWorkbookData;
import ir.sunsor.interfaces.SaveObjectToWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) throws IOException {

        CreateFile createFile = new CreateFileImpl();
        ConstructObject constructObject = new ConstructPerson();
        SaveObjectToWorkbook saveObjectToWorkbook = new SavePersonToWorkbook();
        PrintWorkbookData printWorkbookData = new PrintWorkbookDataImpl();

        Manager manager = new Manager(createFile,constructObject,saveObjectToWorkbook);

        printWorkbookData.print(manager.getWorkbook());

    }
}

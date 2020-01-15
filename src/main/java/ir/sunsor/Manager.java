package ir.sunsor;

import ir.sunsor.interfaces.ConstructObject;
import ir.sunsor.interfaces.CreateFile;
import ir.sunsor.interfaces.PrintWorkbookData;
import ir.sunsor.interfaces.SaveObjectToWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Manager {

    private CreateFile createFile;
    private ConstructObject constructObject;
    private SaveObjectToWorkbook saveObjectToWorkbook;

    private Workbook workbook;

    public Manager(CreateFile createFile, ConstructObject constructObject, SaveObjectToWorkbook saveObjectToWorkbook) {

        workbook = saveObjectToWorkbook.save(constructObject.construct() , createFile.createFile());
    }


    public Workbook getWorkbook() {
        return workbook;
    }

}

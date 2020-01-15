package ir.sunsor.interfaces;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;

public interface SaveObjectToWorkbook<T , R> {

    Workbook save(T t , File file);
}

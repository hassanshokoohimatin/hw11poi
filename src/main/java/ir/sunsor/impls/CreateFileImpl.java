package ir.sunsor.impls;

import ir.sunsor.interfaces.CreateFile;

import java.io.File;

public class CreateFileImpl implements CreateFile {
    public File createFile() {
        File file = new File("persons.xlsx");
        return file;
    }
}

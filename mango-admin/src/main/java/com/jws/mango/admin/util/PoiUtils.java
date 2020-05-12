package com.jws.mango.admin.util;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class PoiUtils {
    public static File createExcelFile(Workbook workbook, String fileName) {
        OutputStream os = null;
        File file = null;

        try {
            file = File.createTempFile(fileName, ".xlsx");
            os = new FileOutputStream(file.getAbsoluteFile());
            workbook.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(os);
        }
        return file;
    }
}

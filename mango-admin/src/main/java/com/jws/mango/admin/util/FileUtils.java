package com.jws.mango.admin.util;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;

public abstract class FileUtils {
    public static void downloadFile(HttpServletResponse response, File file, String newFileName) {
        try {
            response.setHeader("Content-Disposition", "attachment; filename=" +
                    new String(newFileName.getBytes(StandardCharsets.ISO_8859_1.name()), StandardCharsets.UTF_8.name()));
            try (BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream())) {

                try (InputStream is = new FileInputStream(file.getAbsolutePath())) {
                    try (BufferedInputStream bis = new BufferedInputStream(is)) {
                        int length = 0;
                        byte[] temp = new byte[1024 * 10];
                        while ((length = bis.read(temp)) != -1) {
                            bos.write(temp, 0, length);
                        }
                        bos.flush();
                    }
                    bos.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


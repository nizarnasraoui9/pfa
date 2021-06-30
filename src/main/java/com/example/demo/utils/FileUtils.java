package com.example.demo.utils;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

public class FileUtils {
    public static String getResourceBasePath() {
        // Get the directory
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {

        }
        if (path == null || !path.exists()) {
            path = new File("");
        }

        String pathStr = path.getAbsolutePath();

        pathStr = pathStr.replace("\\target\\classes", "");

        return pathStr;
    }
}

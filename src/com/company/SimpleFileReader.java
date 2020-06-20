package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileReader implements FileReader {

    @Override
    public List<String> readLines(String url) {
        String currentLine;
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(url))) {
            while ((currentLine = bufferedReader.readLine()) != null) {
                list.add(currentLine);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}


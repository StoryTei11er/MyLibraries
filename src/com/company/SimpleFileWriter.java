package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class SimpleFileWriter implements FileWriter {

    @Override
    public void writeLines(List<String> lines, String url) {
        List<String> temp = lines;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(url))) {
            for (String s : temp) {
                bufferedWriter.write(s  + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.io.IOException;
import java.util.List;

public interface FileReader {

    List<String> readLines(String url) throws IOException;
}

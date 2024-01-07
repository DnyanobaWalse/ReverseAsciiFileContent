package com.study.impl;

import com.study.interfaces.InputOutputOperations;

public class MockInputOutputOperation implements InputOutputOperations {
    private String input;
    private String output;

    @Override
    public String read(String filePath) {
        return input;
    }

    @Override
    public void write(String filePath, String content) {
        output = content;
    }

    public void setReadFileContent(String readFileContent) {
        this.input = readFileContent;
    }

    public String getWriteFileContent() {
        return output;
    }
}

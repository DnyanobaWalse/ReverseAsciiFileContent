package com.study.test;
import org.junit.jupiter.api.Test;

import com.study.StringReverse;
import com.study.impl.MockInputOutputOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringReverseTest {

    @Test
    public void testReverseFile() {
        MockInputOutputOperation mock = new MockInputOutputOperation();
        StringReverse stringReverse = new StringReverse(mock);
        mock.setReadFileContent("ABC");
        stringReverse.reverseFile("input.txt", "output.txt");
        assertEquals("CBA", mock.getWriteFileContent());
    }
}

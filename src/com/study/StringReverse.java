package com.study;

import java.util.Arrays;

import com.study.interfaces.InputOutputOperations;

public class StringReverse {
    private final InputOutputOperations inputOutputOperations;



    public String reverseString(String st) {
    	int start=0;
    	int end= st.length()-1;
    	char[] stArray = st.toCharArray();
    	while(start < end) {
    		
    		char temp = stArray[start];
    		stArray[start] = stArray[end];
    		stArray[end] = temp;
    		
    		
    		start++;
    		end--;
    		
    	}
    	System.out.println("res"+Arrays.toString(stArray));
    	System.out.println("res"+String.valueOf(stArray));
    	return String.valueOf(stArray);
    }
    
    public void reverseFile(String in, String out) {
        String resp = inputOutputOperations.read(in);
        String resString = reverseString(resp);
        inputOutputOperations.write(out, resString);
    }
    
    public StringReverse(InputOutputOperations inputOutputOperations) {
        this.inputOutputOperations = inputOutputOperations;
    }
}

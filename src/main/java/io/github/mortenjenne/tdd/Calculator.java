package io.github.mortenjenne.tdd;

import java.util.ArrayList;
import java.util.List;


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(String numbers){
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
        String[] parts = numbers.split(",");

        return formatAndSumStrings(parts);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide with zero");
        }
        return a / b;
    }

    private int formatAndSumStrings(String[] parts){
        int sum = 0;

        for (String part: parts){
            String trimmed = part.trim();
            if(!trimmed.isEmpty()){
                try {
                    sum += Integer.parseInt(trimmed);
                } catch (NumberFormatException e){
                    System.out.println("Invalid number " + trimmed);
                }
            }
        }
        return sum;
    }
}

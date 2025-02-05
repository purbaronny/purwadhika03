package com.purwadhika;

public class Practice03 {

    public long calculateNumberSeries(int value) {
        if(value < 0) {
            throw new IllegalArgumentException("value must be positive integer");
        }

        String text = String.valueOf(value);
        char[] chs = text.toCharArray();

        long result = 0;
        for(char ch : chs) {
            int temp = Integer.valueOf(String.valueOf(ch));
            result += temp;
        }
        return result;
    }

    public boolean isPrime(int value) {
        if(value < 2) {
            return false;
        }

        boolean result = true;

        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public int largestNumbers(int[] values) {
        if(values == null) {
            throw new IllegalArgumentException("values is null");
        }

        int result = values[0];

        for(int i = 1; i < values.length; i++) {
            if(values[i] > result) {
                result = values[i];
            }
        }

        return result;
    }

    public long calculator(int value1, int value2, String operand) {
        if(operand == null || operand.trim().isEmpty()) {
            throw new IllegalArgumentException("operand is null or empty string");
        }
        long result = 0;

        switch (operand) {
            case "+":   result = value1 + value2;
                        break;
            case "-":   result = value1 - value2;
            break;
            case "*":   result = value1 * value2;
            break;
            case "/":   if(value2 == 0) {
                            throw new IllegalArgumentException("value2 can not be 0");
                        }
                        result =    value1 / value2;
                        break;
            default: throw new IllegalArgumentException("operand must be + or - or * or /");
        }
        return result;
    }

    public String reversedString(String text) {
        if(text == null) {
            return null;
        }
        String result = "";
        char[] chs = text.toCharArray();
        int length = chs.length;
        for(int i = length - 1; length >= 0; i--) {
            result += String.valueOf(chs[i]);
        }
        return result;
    }

    public String fibonacci(int length, int start) {
        String result = "";
        // TODO start
        // TODO end
        return result;
    }

    public String fibonacci(int length) {
        return fibonacci(length, 0);
    }
}

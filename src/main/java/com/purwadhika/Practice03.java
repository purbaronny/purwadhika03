package com.purwadhika;

public class Practice03 {

    private static char[] VOWELS = ['A', 'I', 'U', 'E', 'O', 'a', 'i', 'u', 'e', 'o'];

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
        if(length < 2) {
            throw new IllegalArgumentException("start must be positive number and greater than 2");
        }

        if(start == 0 || start == 1) {

        } else {
            throw new IllegalArgumentException("start must be 0 or 1");
        }

        String result = "";
        int a = start;
        int b = 1;
        if(start == 1) {
            length += 1;
        }
        result += a + " " + b;
        for(int i = 2; i < length; i++) {
            int next = a + b;
            result += " " + next;
            a = b;
            b = next;
        }
        return result;
    }

    public String fibonacci(int length) {
        return fibonacci(length, 0);
    }

    public int countVowel(String text) {
        if(text == null) {
            return -1;
        }
        int result = 0;
        char[] chs = text.toCharArray();
        for(char ch : chs) {
            for(char vowel : VOWELS) {
                if(ch == vowel) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public int[] bubbleSort(int[] values) {
        if(values == null) {
            throw new IllegalArgumentException("values is null");
        }
        int length = values.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; i < length - i - 1; j++) {
                if(values[j] > values[j + 1]) {
                    int temp = values[i];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }
}

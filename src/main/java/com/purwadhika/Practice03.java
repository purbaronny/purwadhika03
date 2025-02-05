package com.purwadhika;

public class Practice03 {

    private static char[] VOWELS = {'A', 'I', 'U', 'E', 'O', 'a', 'i', 'u', 'e', 'o'};

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
        for(int i = length - 1; i >= 0; i--) {
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
            for(int j = 0; j < length - i - 1; j++) {
                if(values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }

    private String printArray(int[] values) {
        if(values != null) {
            int length = values.length;
            if(length > 0) {
                String text = "[";
                for(int i = 0; i < length; i++) {
                    text += values[i] + "";

                    if(i < length - 1) {
                        text += ", ";
                    }
                }
                text += "]";
                return text;
            } else {
                return "";
            }
        } else {
            return null;
        }
    }

    public boolean isAnagram(String text1, String text2) {
        if(text1 == null || text1.isEmpty()) {
            throw new IllegalArgumentException("text1 is null or empty string");
        }
        if(text2 == null || text2.isEmpty()) {
            throw new IllegalArgumentException("text2 is null or empty string");
        }
        text1 = text1.trim();
        text2 = text2.trim();
        if(text1.length() != text2.length()) {
            throw new IllegalArgumentException("text1 length is not equal to text2 length");
        }
        boolean result = false;
        char[] chs1 = text1.toLowerCase().toCharArray();
        char[] chs2 = text2.toLowerCase().toCharArray();
        int totalText1 = totalChar(chs1);
        int totalText2 = totalChar(chs2);
        if(totalText1 == totalText2) {
            result = true;
            int[] ints1 = toIntArray(chs1);
            int[] ints2 = toIntArray(chs2);
            int length = ints1.length;
            for(int i = 0; i < length; i++) {
                if(ints1[i] != ints2[i]) {
                    result = false;
                    break;
                }
            }
        } else {

        }
        return result;
    }

    private int[] toIntArray(char[] values) {
        if(values == null) {
            throw new IllegalArgumentException("values is null");
        }
        int length = values.length;

        if(length < 1) {
            throw new IllegalArgumentException("values length below 1");
        }

        int[] result = new int[length];
        for(int i = 0; i < length; i++) {
            result[i] = (int) ((byte) values[i]);
        }
        result = bubbleSort(result);
        return  result;
    }

    public int totalChar(char[] chs) {
        int total = 0;
        for(char ch : chs) {
            total += (byte) ch;
        }
        return total;
    }

    public int getSecondSmallest(int[] values) {
        if(values == null) {
            throw new IllegalArgumentException("values is null");
        }

        int length = values.length;
        if(length == 0) {
            throw new IllegalArgumentException("values length is 0");
        }
        int result = values[0];
        values = bubbleSort(values);
        result = values[1];
        return result;
    }

    public static void main(String[] args) {
        Practice03 practice03 = new Practice03();
        System.out.println("Write a program to calculate the sum of digits in a given number.");
        System.out.println(practice03.calculateNumberSeries(1234));
        System.out.println("Create a function to check if a number is prime.");
        System.out.println(practice03.isPrime(17));
        System.out.println(practice03.isPrime(10));
        System.out.println("Write a program to find the largest element in an array.");
        int[] values = {3, 7, 2, 8, 1};
        System.out.println(practice03.largestNumbers(values));
        System.out.println("Implement a simple calculator that can perform addition, subtraction, multiplication, and division.");
        System.out.println(practice03.calculator(5, 3, "+"));
        System.out.println(practice03.calculator(10, 2, "/"));
        System.out.println("Write a function to reverse a string without using built-in reverse functions.");
        System.out.println(practice03.reversedString("hello"));
        System.out.println("Create a program to generate the Fibonacci sequence up to n terms.");
        System.out.println(practice03.fibonacci(6));
        System.out.println(practice03.fibonacci(6, 1));
        System.out.println("Write a function to count the number of vowels in a string.");
        System.out.println(practice03.countVowel("programming"));
        System.out.println("Implement a program to sort an array of integers using bubble sort. Pls Without built in methods :)");
        values = new int[]{64, 34, 25, 12, 22, 11, 90};
        values = practice03.bubbleSort(values);
        System.out.println(practice03.printArray(values));
        System.out.println("Create a function to check if two strings are anagrams.");
        System.out.println(practice03.isAnagram("listen", "silent"));
        System.out.println(practice03.isAnagram("hello", "world"));
        System.out.println("Write a program to find the second smallest element in an array.");
        values = new int[]{5, 3, 8, 1, 2, 9};
        System.out.println(practice03.getSecondSmallest(values));
    }
}

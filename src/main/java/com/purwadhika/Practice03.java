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

        return result;
    }
}

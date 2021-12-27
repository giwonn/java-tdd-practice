package study;

import java.util.Scanner;

public class CalculateString {



    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int calculate(String str) {
        String[] values = str.split(" ");
        int sum = Integer.parseInt(values[0]);

        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) continue;
            if (i == values.length-1) break;

            int value = Integer.parseInt(values[i + 1]);
            switch(values[i]) {
                case "+":
                    sum = plus(sum, value);
                    break;
                case "-":
                    sum = minus(sum, value);
                    break;
                case "*":
                    sum = multiple(sum, value);
                    break;
                case "/":
                    sum /= Integer.parseInt(values[i+1]);
                    break;
            }
        }

        return sum;
    }

}
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        for (int i = 1; i < 1000; i*=2)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;//i = 1 -> 0 + 1 = 1; i = 2 -> 1 + 0 = 1; i = 3 -> 1 + 1 = 2;
            g = f - g;//i = 1 -> 1 - 1 = 0; i = 2 -> 1 - 0 = 1; i = 3 -> 1 - 1 = 0;
        }
    }
}

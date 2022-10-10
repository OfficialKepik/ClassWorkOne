package com.company;

public class Task2 {
    public static void main(String[] args) {
        int count2 = 0, count3 = 0;
        for (int i = 1; i < 11; i++) {
            if (i%2==0)
                count2++;
            if (i%3==0)
                count3++;
        }
        System.out.println("div on 2 : " + count2 + ", div on 3 : " + count3);
    }
}

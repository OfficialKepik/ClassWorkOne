package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int num = 2;
        Scanner scanner = new Scanner(System.in);
        while (num != 0 & num != 1) {
            System.out.println(" Enter a number 0 or 1 : ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("zero");
                break;
            }
            else if (num == 1) {
                System.out.println("one");
                break;
            }
            else
                System.out.println("I don't know");
        }
    }
}

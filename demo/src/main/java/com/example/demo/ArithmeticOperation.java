package com.example.demo;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which table you want");
        int num = scanner.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}

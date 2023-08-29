package com.saika.s2023.s08.s28;

import java.util.*;
public class Calculator {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        int operation = sc.nextInt();
        int r;

        switch (operation) {
            case 1:
            r = a + b;
                System.out.println(r);
            break;
            case 2:
                r = a - b;
                System.out.println(r);
                break;

            case 3:
                r = a * b;
                System.out.println(r);
                break;

            case 4:
                r = a / b;
                System.out.println(r);
                break;

            case 5:
                r = a % b;
                System.out.println(r);
                break;

            default:
                System.out.println("Invalid");

    }

}}

package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RemesyClass question1 = new RemesyClass(68000, 125000);
        RemesyClass question2 = new RemesyClass(23000.00, 73000.00);
        RemesyClass question7 = new RemesyClass();


        System.out.println("\nQuestion 1:");
        System.out.println(question1.highestSalary());

        System.out.println("\nQuestion 2:");
        System.out.println(question2.smallestCarPrice());

        System.out.println("\nQuestion 27:");
        System.out.println(question7.randomNumber());

    }

}
package com.ajay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
//        String fruitName = in.next();
//        switch (fruitName) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Sweet red fruit");
//            case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("Small fruits");
//            default -> System.out.println("Wrong fruit");
//        }
        int year = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            default -> System.out.println("Sunday");
//        }
        if (year%4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }
            else{
                System.out.println("not leap year");
            }
    }
}

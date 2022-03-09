package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Please install Android App, link here");
        } else if (clientOS == 0){
            System.out.println("Please install iOS App, link here");
        }

        //Assignment 2
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please install Android App, link here");
            } else {
                System.out.println("Please install Lite Android App, link here");
            }
        } else if (clientOS == 0){
            if (clientDeviceYear >= 2015) {
                System.out.println("Please install iOS App, link here");
            } else {
                System.out.println("Please install Lite iOS App, link here");
            }
        }

        //Assignment 3
        int leapYearCheck = 2012;
        if ((leapYearCheck % 4 == 0 && leapYearCheck % 100 != 0) || leapYearCheck % 400 == 0) {
            System.out.println(leapYearCheck + " is a leap year!");
        } else {
            System.out.println(leapYearCheck + " is a not leap year!");
        }

        //Assignment 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) deliveryDays += 1;
        if (deliveryDistance > 60) deliveryDays += 1;
        if (deliveryDistance > 100) deliveryDays += 1;

        if (deliveryDays < 4) {
            System.out.println("Your card will be delivered in " + deliveryDays + " day(s).");
        } else {
            System.out.println("We cant deliver to your address!");
        }

        //Assignment 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn!");
                break;
            default:
                System.out.println("This month doesn't exist!");
        }
    }
}
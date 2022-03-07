package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Please install Android App, link here");
        } else {
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
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please install iOS App, link here");
            } else {
                System.out.println("Please install Lite iOS App, link here");
            }
        }

        //Assignment 3
        int leapYearCheck = 2012;
        if ((leapYearCheck % 4 == 0 && leapYearCheck % 100 != 0) || leapYearCheck % 400 ==0){
            System.out.println(leapYearCheck + " is a leap year");
        } else {
            System.out.println(leapYearCheck + " is a not leap year");
        }
    }
}

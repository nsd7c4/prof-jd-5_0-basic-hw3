package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Please install Android App, link here");
        } else if (clientOS == 0) {
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
        } else if (clientOS == 0) {
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

        //Assignment 6
        int clientAge = 19;
        int clientSalary = 58_000;
        int creditLimit = 0;

        if (clientAge >= 23) {
            creditLimit = clientSalary * 3;
        } else {
            creditLimit = clientSalary * 2;
        }

        if (clientSalary >= 80000) {
            creditLimit *= 1.5;
        } else if (clientSalary >= 50000) {
            creditLimit *= 1.2;
        }

        System.out.println("We are ready to issue you a credit card with limit of " + creditLimit + " rubles.");

        //Assignment 7
        clientAge = 25;
        clientSalary = 60000;
        int wantedSum = 330000;
        float apr = 10;
        int loanLength = 12;

        if (clientAge < 23) {
            apr += 1f;
        } else if (clientAge < 30) {
            apr += 0.5f;
        }
        if (clientSalary > 80000) {
            apr -= 0.7f;
        }

        float creditWithIntrestMonthly = wantedSum * (1 + apr / (float) 100) / loanLength;

        System.out.print("Maximum payment for salary of " + clientSalary + " rubles is " + clientSalary / 2 + " rubles. Loan payment is " + creditWithIntrestMonthly + " rubles.");

        if (creditWithIntrestMonthly > clientSalary / 2) {
            System.out.println(" Denied.");
        } else {
            System.out.println(" Approved.");
        }

    }
}
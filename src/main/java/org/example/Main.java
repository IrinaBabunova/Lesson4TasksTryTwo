package org.example;

public class Main {
    public static void main(String[] args) {


                // System.out.println("Задача 1");
                // int clientOS=1;
                // if (clientOS==0) {
                //      System.out.println("Установите версию приложения для iOS по ссылке ");
                // }
                //   else if (clientOS==1) {
                //       System.out.println("Установите версию приложения для Android по ссылке");
                //    }

                System.out.println("Задача 2");
                int clientOS = 1;
                int clientDeviceYear = 2015;
                if (clientOS == 0 && clientDeviceYear < 2019) {
                    System.out.println("Установите Lite-версию приложения для iOS по ссылке ");
                } else if (clientOS == 0 && clientDeviceYear >= 2019) {
                    System.out.println("Установите версию приложения для iOS по ссылке ");
                } else if (clientOS == 1 && clientDeviceYear < 2019) {
                    System.out.println("Установите lite-версию приложения для Android по ссылке");
                } else if (clientOS == 1 && clientDeviceYear >= 2019) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }

                System.out.println("Задача 3");
                int year = 2015;
                if (year % 4 != 0) {
                    System.out.println(year + " не является высокосным годом");
                } else if (year % 100 != 0) {
                    System.out.println(year + " является высокосным годом");
                } else if (year % 400 == 0) {
                    System.out.println(year + " является высокосным годом");
                } else System.out.println(year + " не является высокосным годом");


                System.out.println("Задача 4");
                int  deliveryDistance = 19;
                int days=1;

                if (deliveryDistance < 20) {
                    System.out.println("На доставку потребуется " + days + "сут");
                }
                if (deliveryDistance >= 20 && deliveryDistance < 60) {
                    days=days+1;
                    System.out.println("На доставку потребуется " + days + " сут");
                }
                if (deliveryDistance >= 60) {
                    days=days+2;
                    System.out.println("На доставку потребуется " + days + " сут");
                }

                System.out.println("Задача 5");
                int monthNumber = 7;
                switch (monthNumber) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Это зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Это весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Это лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Это осень");
                        break;
                    default:
                        System.out.println("Такого месяца не сущестует");


                }
                System.out.println("задача 6");

                int age=21;
                int salary=45000;
                if ((age>23) && (salary>50000) && (salary<80000)) {
                    double sumCreditCart=1.2*3*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart);}
                else if ((age<23) && (salary>50000) && (salary<80000)) {
                    double sumCreditCart2=1.2*2*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart2);}
                else if ((age>23) && (salary>=80000)) {
                    double sumCreditCart3=1.5*3*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart3);}
                else if ((age<23) && (salary>=80000)) {
                    double sumCreditCart4=1.5*2*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart4);}
                else if ((age>23) && (salary<50000)) {
                    double sumCreditCart5=3*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart5);}
                else if ((age<23) && (salary<50000)) {
                    double sumCreditCart6=2*salary;
                    System.out.println("Вы можете получить кредит " + sumCreditCart6);}
            }
        }
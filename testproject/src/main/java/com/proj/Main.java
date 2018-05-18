package com.proj;

public class Main {

    public static void main(String args[]) throws InterruptedException {

        //creare obiect nou - sllep
        Sleep sleepObject = new Sleep();

        //apelare metoda sleep cu parametrii
        sleepObject.sleep("seconds", 10);

        int x= 50;
        Integer y = new Integer(50);

        System.out.println( y.equals(x));
    }
}

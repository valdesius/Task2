package com.company;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException  {
        Locale.setDefault(Locale.ROOT);
        int a = readNumber();
        printInfo(a);

}

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число из списка: ");
        System.out.println("1. отрицательное нечетное однозначное число" + "\n" + "2. положительное четное трехзначное число " + "\n" + "3. Нулевое число");
        int num;

        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.print("Неправильный формат записи ");
            return readNumber();
        }
        return num;
    }

    private static void printInfo(int num){
        if((num%2)!=0 && num<0 && num > -10 && num<= -1){
            System.out.println("отрицательное нечетное однозначное число ");
        } else if ((num%2)==0 && num > 0 && num >= 100 && num < 1000){
            System.out.println("положительное четное трехзначное число ");

        } else if(num == 0){
            System.out.println("Нулевое число");
        }
    }

}

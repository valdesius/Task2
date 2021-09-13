package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число в диапазоне от: -1000 до 1000  - ");
        int a = Integer.parseInt(bufferedReader.readLine());


        if((a%2)!=0 && a<0 && a > -10 && a<= -1){
            System.out.println("отрицательное нечетное однозначное число ");
        } else if ((a%2)==0 && a > 0 && a >= 100 && a < 1000){
            System.out.println("положительное четное трехзначное число ");

        } else if(a == 0){
            System.out.println("Нулевое число");

        }


}}

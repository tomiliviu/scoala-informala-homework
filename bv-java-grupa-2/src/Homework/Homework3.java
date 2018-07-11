package Homework;

import java.util.Scanner;
    public class Homework3{
        public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");

            int n =s.nextInt();
            int maxDigit=0;

        while (n > 0){
            int i = n%10;

        if (maxDigit < i ){
            maxDigit = i;
        }
            n=n/10;
        }
       System.out.println("The max digit of your number is: " + maxDigit);
        }
    }
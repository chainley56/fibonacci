package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is it a Fibonacci number?");
        System.out.println("Enter a number to find out!");
        Scanner kb = new Scanner(System.in);
        int FinalNum = kb.nextInt();

        String numbers = "";
        String FinalString;
        FinalString = String.valueOf(FinalNum);

        for (int i = 1; i <= FinalNum; i++) {
            int temp = fibonacci(i);
            numbers = numbers + temp + ",";
            if (temp >= FinalNum) {
                break;
            }
        }

        if (numbers.contains(FinalString)) {
            System.out.println(FinalNum + " is a Fibonacci number");
        }
        else {
            System.out.println(FinalNum + " is not a Fibonacci number.");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}


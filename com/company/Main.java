package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array of random numbers: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.print("Now enter the maximum value of the array element: ");
        int max = input.nextInt();
        int[] array = new int[size];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
            sum += array[i];
        }
        int average;
        average = sum / size;
        System.out.println("The average of an array of integers is " + average + ".");
    }
}

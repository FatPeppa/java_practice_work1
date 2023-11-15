package practice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.util.Collections.swap;

public class second_practice_java {

    public static void main(String[] args) {
        printArrSum();
        printCommandArgs(args);
        printHarmonic(10);
        printRandomArray();
        printFactorial(5);
    }


    //task 1
    public static void printArrSum() {
        int[] a = {1, 2, 3 ,4};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
        sum = 0;

        int index = 0;

        while (index < a.length) {
            sum += a[index];
            index++;
        }

        System.out.println(sum);
        sum = 0;
        index = 0;

        do {
            sum += a[index];
            index++;
        } while (index < a.length);

        System.out.println(sum);
    }

    //task2

    public static void printCommandArgs(String[] args) {
        for (String arg : args) {
            System.out.print(arg);
        }

        System.out.println();
    }

    //task3
    public static void printHarmonic(int n) {
        double result = 0.0;

        for (int i = n; i > 0; i--) {


            result = result + (double)1 / i;

            System.out.print(result + ", ");
        }
    }

    //task4
    public static void printRandomArray() {
        Random rand = new Random();

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        printIntArr(arr);
        Arrays.sort(arr);
        printIntArr(arr);
    }

    public static void printIntArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[arr.length - 1]);
    }

    public static void printFactorial(int n) {
        System.out.print(calculateFactorial(n));
    }
    public static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }

        return result;
    }
}




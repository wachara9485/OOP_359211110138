package ooplab5;

import java.util.Scanner;

public class InputDatatoArray {
    private static int MAX = 5;
    public static void  main (String[]args) {
        int number[] = new int[MAX];
        System.out.println(number.length);
        //for
        number = inputData(number);
        showData(number);
    }//main

    private static void showDataEncharce(int[]number) {
        System.out.println("Data in Array: ");
        for (int val : number)
            System.out.print(val + " ");
    }

    private static void showData(int[]number){
        System.out.println("Data in Array: ");
        for (int i=0;i<number.length;i++)
        System.out.print(val+" ");
    }

    private static int[]inputData(int[]number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an intiger: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println("number[" + i + "]: ");
            number[i] = scanner.nextInt();
        }
        return number;
    }
}//class

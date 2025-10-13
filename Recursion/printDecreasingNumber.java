package Recursion;

import java.util.Scanner;

public class printDecreasingNumber {
    public static void printDec(int n){
        if(n==1){
        System.out.println("1");
        return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
    }

    
}

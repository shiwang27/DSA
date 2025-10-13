package Recursion;

import java.util.Scanner;

public class FindNthFibonacciNumber {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fn=fib(n-1);
        int fnm1=fib(n-2);
        return fn + fnm1;

    

    }

    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

}


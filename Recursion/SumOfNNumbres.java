package Recursion;

import java.util.Scanner;

public class SumOfNNumbres {

    public static int printSum(int n){

        if(n==1){
            return 1;
        }
        int fnm1 = printSum(n-1);
        int fn = n+ fnm1;
        return fn;

    }


    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}


package Recursion;

import java.util.Scanner;

public class PrintXtoThePowerN {
    public static int XpowerN(int x, int n){

        if(n==0){
            return 1;
        }

        return x * XpowerN(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println("enter number and power of the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(XpowerN(x, n));
    }

}

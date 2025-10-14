package Recursion;

import java.util.Scanner;

public class optimizedXpowerN{
    public static int optpowerxton(int x, int n){
        if(n==0){
            return 1;
        }

        int halfpower = optpowerxton(x, n/2);
        if(n%2==0){
            return halfpower * halfpower;
        }
        else{
            return x * halfpower * halfpower;
        }


    }

    public static void main(String[] args) {
        System.out.println("enter number and power of the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(optpowerxton(x, n));
    }

}

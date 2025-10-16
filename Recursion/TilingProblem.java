package Recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int tilingWays(int n){

        if(n==0 || n==1){
            return 1;
        }
        int nm1 = tilingWays(n-1);
        int nm2 = tilingWays(n-2);
        return nm1 + nm2;
        
    }

    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tilingWays(n));
    }

}

package Recursion;

import java.util.Scanner;

public class IsArraySortedOrNot {
    public static boolean isSorted(int[] arr, int i){

        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements of array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int arr[] = {2,1,5,3,6};
        System.out.println(isSorted(arr,0));
    }

}

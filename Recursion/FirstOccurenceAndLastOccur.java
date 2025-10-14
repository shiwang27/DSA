package Recursion;

import java.util.Scanner;

public class FirstOccurenceAndLastOccur {
    public static int FirstOccur(int[] arr, int n, int i){
        if(arr[i]==n){
            return i+1;
        }
        if(i==arr.length){
            return -1;
        }
        return FirstOccur(arr, n, i+1);
    }

    public static int lastOccur(int[] arr, int n, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, n, i+1);
        if(isFound==-1 && arr[i]==n){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("enter the elements of array:");
        int[] arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to find first occurence:");
        int n = sc.nextInt();
        System.out.println("first occur: " + FirstOccur(arr, n, 0));
        System.out.println("last Occur: " + lastOccur(arr, n, 0));
    }

}

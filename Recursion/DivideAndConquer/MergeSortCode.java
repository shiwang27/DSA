package Recursion.DivideAndConquer;

import java.util.Arrays;

public class MergeSortCode {

    public static void MergeSort(int[] arr, int si, int ei){

        if(si>=ei) {
            return;
            
        }
        int mid = si + (ei - si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }

    

    private static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;

        }

        while(i<=mid){
            temp[k++]= arr[i++];
        }

        while(j<=ei){
            temp[k++]= arr[j++];
        }

        for(k=0,i=si;k<=temp.length-1;i++,k++){

            arr[i]=temp[k];
        }

	}



	public static void main(String[] args) {
        int[] arr = {6,4,3,6,43,6,3,5,2,5,7,47,2};
        MergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}

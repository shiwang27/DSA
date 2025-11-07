package Recursion.DivideAndConquer;

import java.util.Arrays;

public class QuickSortCode {

    public static void QuickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int part = partision(arr, si, ei);
        QuickSort(arr, si, part-1);
        QuickSort(arr, part+1, ei);
    }

    private static int partision(int arr[],int si, int ei) {
		int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= arr[ei];
        arr[ei] = temp;
        return i;

	}

	public static void main(String[] args) {
        int[] arr = {6,4,3,6,43,6,3,5,2,5,7,47,2};
        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}

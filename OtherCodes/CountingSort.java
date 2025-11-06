package OtherCodes;

import java.util.Arrays;

public class CountingSort {

    public static void countingSORT(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; 
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }



    }
    public static void main(String[] args) {
        int arr[] ={1,1,5,6,3,6,3,2,4,5,3,1,6};
        countingSORT(arr);
        System.out.println(Arrays.toString(arr));
        
    }

}

package AP2904;

import java.util.Arrays;

public class GFGL_1_4_ArraysSort {
    public static void main(String[] args){
        int [] arr = {1,1,1,1,8,7,4,0,8,9,1,2};
        arr= usingArraySort(arr);
        for(int value:arr)
                System.out.print(value+" ");
        //print in form of string
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
    public static int[] usingArraySort(int[] arr){
         Arrays.sort(arr,0,arr.length-1); // remove duplicates + descending order
         return arr;
    }
}

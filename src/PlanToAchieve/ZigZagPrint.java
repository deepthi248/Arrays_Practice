package PlanToAchieve;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ZigZagPrint extends ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {12,0,89,87,65,45,33};
        int[] answer = zigZagPrintBruteForce(arr);
        for( int i : answer)
            System.out.print(i+" ");
    }
    public static  int[] zigZagPrintBruteForce(int [] arr){
        int n =arr.length-1;
        int answer[] = new int[n+1];
        Arrays.sort(arr);

        for( int i = n, j=0; i>=0 && j<=n; i--, j+=2){
            answer[j] = arr[i];
        }
        for( int i =0, j=1; i<=n && j<=n ;i++,j+=2){
            answer[j] = arr[i];
        }
        return answer;

    }
    public static void swap(int [] arr, int i,int j, int z){

    }
}

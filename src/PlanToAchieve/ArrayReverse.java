package PlanToAchieve;

import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr ={12,0,89,87,65,45,33};
     // inplaceReverse(arr); //forloop and swap --O(N) + SC-O(1)
      // recursiveWay(arr,0, arr.length-1); // --- O(N) --O(1)
       stackImplementation(arr) ;
        for( int i : arr)
            System.out.print(i+" ");

    }
// TIime COmplexity - O(N) & Soace COmplexity o(N) for stack creation
    private static void stackImplementation(int[] arr) {
        Stack<Integer> myStack = new Stack<>();
        for( int i: arr)
            myStack.add(i);

        for( int j=0;j< arr.length;j++){
            arr[j] = myStack.pop();
        }



    }

    // timecomplexity  o(n/2) ->o(N)
    public static void inplaceReverse(int [] arr){
        int mid = 0 + (arr.length -1 -0 )/2;
        for( int i =0; i <= mid; i++){

            swap(arr, i, arr.length-i-1);
        }

    }
    // timecomplexity ->o(N)

    public static void recursiveWay(int [] arr,int start, int end){
        if( start > end)
            return;
        else {
            swap(arr, start, end);
            recursiveWay(arr, start+1, end-1);
        }
    }


    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i]= arr[j] ;
        arr[j] = temp;
    }

}

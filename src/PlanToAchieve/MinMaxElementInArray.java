package PlanToAchieve;

import java.util.Arrays;

public class MinMaxElementInArray {
    public static void main(String[] args) {
     int arr[] = {90,98,78,67,45,33};
    int [] answer = usingSort(arr);
     answer = bruteForce(arr);
    System.out.println("Minimum Element " +  answer[0]);
    System.out.println("Max Element "+answer[1]);



    System.out.println("Recursive Approach of Minimum Element " +  getMinRecursive(arr,arr.length-1));
     System.out.println("Recursive Approach of Maximum Element " +  getMaxRecursive(arr,arr.length-1));

    }
//TIME COMPLEXITY - O(N) ; SPACE COMPLEXITY - ?
    private static int[] bruteForce(int[] arr) {
        int [] answer = new int[2];
        answer[0]=Integer.MAX_VALUE; //to cover edge cases - can be modified according to the inputs
        for(int i: arr){
            answer[0] = Math.min(answer[0],i);
            answer[1] = Math.max(answer[1],i);
        }
        return answer;
    }

//TIME COMPLEXITY - O(NlogN) ; SPACE COMPLEXITY - O(1)

    public static int[] usingSort(int arr[]){
        Arrays.sort(arr);
        int [] answer = new int[2];
        answer[0] = arr[0];
        answer[1] =arr[arr.length-1];

        return answer;
    }
//O(N)
    public static int getMinRecursive(int [] arr, int n){
        if( n==1)
            return arr[0];
        else{
           return Math.min(arr[n], getMinRecursive(arr,n-1));

        }
    }
// O(N)
    public static int getMaxRecursive(int [] arr, int n){
        return (n == 1) ? arr[0] : Math.max(arr[n], getMaxRecursive(arr ,n - 1));
    }

}

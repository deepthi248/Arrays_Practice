package AP28042021;/*
Input :
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3}
x = 3
k = 3
Output : Yes
There are 4 non-overlapping segments of size k in the array,
 {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}.
 3 is present all segments.
Input :
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
x = 23
k = 5
Output :Yes
There are three segments and last segment is not full
{21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}.
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9}
x = 8
k = 2
Output : No
 */

import javax.swing.*;

public class GRGL1_12804 {

    public static void main(String[] args){
        int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int element = 3;
        int k =3;
        subArrayElementCheck(arr, element,k);
    }
    public static void subArrayElementCheck(int [] arr, int element, int k){
        int [] result = new int[k];
        int temp =0, count=0;
        for( int i =0; i<arr.length; i+=k){
            while(temp < k){
                result[temp]= arr[i];
                i++;
                temp++;
            }
            if(isPresent(result,element)){
                count++;
            }
        }
        if(count ==k)
                System.out.print("Yes");
        else
                System.out.print("No");

    }
    public static boolean isPresent(int [] arr, int element){
        boolean bool = false;
        for( int value : arr){
            if(value==element)
                    bool = true;
        }

        return bool;
    }




}

package AP28042021;

public class GFGL1_3 {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7,8};
        arr= reverseArray(arr);
        for(int value: arr)
                System.out.print(value+" ");
    }
    //inplace array swapping
    public static int[] reverseArray(int [] arr){

        int mid = 0+ (arr.length-0)/2; int temp=arr.length-1;
        for( int i =0; i<mid;i++){
            swap(arr, i, temp);
            temp--;
        }

        return arr;
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //in-place array swapping method2



}

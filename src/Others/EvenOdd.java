package Others;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[] ={12, 34, 45, 9, 8, 90, 3};
        evenOddArrangement(arr);
        for (int value:arr)
            System.out.print(value+" ");

        }
    public static void evenOddArrangement(int[] arr){
        int mid = 0+(arr.length-1 -0)/2;
        int even_counter=0, odd_counter= arr.length-1;
        for( int i=0;i <= mid;){
            if( arr[i]%2 !=0 && odd_counter > i){ //exchange
                if(arr[odd_counter] % 2 == 0){
                    swap(arr, odd_counter,i);
                    odd_counter--;
                    i++;
                }
                else if( odd_counter > i){
                    odd_counter--;
                    swap(arr, odd_counter,i);
                    odd_counter--;

                }
            }

            else
                i++;
        }
    }
    public static void swap(int [] arr, int j , int i){
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
}

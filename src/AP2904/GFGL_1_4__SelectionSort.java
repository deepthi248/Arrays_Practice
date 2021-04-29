package AP2904;
// It can be used to sort in ascending and descending order
public class GFGL_1_4__SelectionSort {
    public static void main(String[] args){
        int [] arr = {1,1,1,1,8,7,4,0,8,9,1,2};
        selectionSort(arr);
        for(int values: arr)
            System.out.print(values+" ");
    }
    public static void  selectionSort(int[] arr){
        //select minimum element and swap it
        int index=0;
        for( int j =0; j < arr.length-1; j++){
            for( int i = j+1; i < arr.length; i++) {
                if (arr[j] > arr[i] ) {
                    swap(arr, j, i);
                }
            }
            index++;
        }
    }
    public static void swap(int [] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}

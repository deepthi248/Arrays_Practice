package AP2904;
import AP2904.GFGL_1_4__SelectionSort;
// By checking the adjacent index values
public class GFGL_1_4BubbleSort {
    public static void main(String [] args){
        int [] arr = {1,1,1,1,8,7,4,0,8,9,1,2};
        bubbleSort(arr);
        for(int values: arr)
            System.out.print(values+" ");
    }

    public static void bubbleSort( int [] arr){
        GFGL_1_4__SelectionSort sort = new GFGL_1_4__SelectionSort();
        for( int i =0; i< arr.length-1;i++){
            for( int j= i+1; j< arr.length;j++ ){
                if(arr[i] > arr[j])
                    sort.swap(arr,i,j);
            }
        }
    }
}

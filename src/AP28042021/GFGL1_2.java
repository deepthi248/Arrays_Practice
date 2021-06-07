package AP28042021;

public class GFGL1_2 {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,10};
        int [] result =max_min(arr);
        System.out.print("min element in array :"+ result[0]+"\n max element in the array :"+result[1]);
    }
    public static int []  max_min(int [] arr){
        int min_max [] = new int[2];
        int min =arr[0];
        int max =arr[0];
        for(int i=0; i< arr.length; i++){
            if( arr[i] <= min )
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];

        }

        min_max[0] = min;
        min_max[1] = max;

        return min_max;
    }
}

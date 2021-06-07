package PlanToAchieve;
// sort the array in terms of odd and even
public class EvenOdd extends  ArrayReverse{
    public static void main(String[] args) {
        int arr[] = {4, 9, 0, 8, 7, 5, 6,3,8};
        int even = 0;
        int odd = arr.length - 1;
        while (even < odd) {
            if (arr[even] % 2 != 0) {
                if (arr[odd] % 2 == 0) {
                    int temp = arr[even];
                    arr[even] =arr[odd];
                    arr[odd] =temp;
                    even++;
                    odd--;
                }
                else
                    odd--;
            }
            else
                even++;
        }
        for( int i: arr)
            System.out.print(i +" ");
    }

}

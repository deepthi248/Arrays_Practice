package PlanToAchieve.Digits;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 19118;
        int product=1;
        int sum=0;
        while(number!=0){
            sum+=number%10;
            product*=number%10;
            number/=10;
        }
        System.out.println(sum+" "+ product);
    }
}

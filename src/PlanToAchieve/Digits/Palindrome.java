package PlanToAchieve.Digits;

public class Palindrome {
    public static void main(String[] args) {
        int number = 456782;
        int odd_sum =0;
        int even_sum=0;

        while(number!=0){
            int mod =number%10;
            if(mod%2==0)
                even_sum+=mod;
            else
                odd_sum+=mod;
            number/=10;
        }

        System.out.println(odd_sum+" "+even_sum);
    }
}

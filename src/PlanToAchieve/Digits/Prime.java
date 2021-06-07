package PlanToAchieve.Digits;

public class Prime {
    public static void main(String[] args) {
        int number = 3;
        int flag = 0;
        for( int i =2; i< Math.sqrt(number);i++){
            if(number%i ==0){
                System.out.println("NO");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Yes");

    }
}

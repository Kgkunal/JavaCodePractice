import java.util.Scanner;

public class PrimeNumberProblem {
    public static void main(String []args){
        System.out.println("Check the number is prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        double sqRoot = Math.sqrt(num);
        for(int i =2 ; i<=sqRoot ; i++){
            if(num%i==0){
              isPrime = false;  
            }
        }
        if(isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is Not Prime");
        }


    }
}

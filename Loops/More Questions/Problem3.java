import java.util.Scanner;

public class Problem3 {
    public static void main(String []args){
        System.out.println("Problem : Find the factorial of a number");
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        sc.close();
        for(int i=1 ; i<=num ; i++){
          if(num < 0){
            System.out.println("Factorial is defined only for negative numbers");
            break;
          }
          factorial *=i;
        }

        System.out.println("Factorial of "+ num + " is " + factorial);


    
    }
}

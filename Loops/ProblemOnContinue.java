import java.util.Scanner;

public class ProblemOnContinue {
    public static void main(String []args){
        System.out.println("Disply all the numbers entered by user except multiples of 10");
        Scanner sc = new Scanner(System.in);
        int inputNumber;
        do{
            System.out.println("Enter number :");
            inputNumber = sc.nextInt();
            if(inputNumber%10==0){
            
                continue;
            }
            System.out.println("Number is :"+inputNumber);
        }while(true);
    }
}

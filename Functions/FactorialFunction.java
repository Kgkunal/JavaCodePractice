import java.util.Scanner;

public class FactorialFunction {
    public static int factorial(int number){
        int factorial = 1;
        for(int i = 1 ; i<number ; i++){
            factorial += factorial*(number- i);
        }
        return factorial;

    }
    public static void main(String []args){
        System.out.println("Function to find factorial of a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int factorial = factorial(number);
        System.out.println("is :"+ factorial);

    }
}

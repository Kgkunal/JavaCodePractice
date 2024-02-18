import java.util.Scanner;

public class productab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        int product = num1*num2;
        System.out.println("Product is "+ num1*num2);
    }
}

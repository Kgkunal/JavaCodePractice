import java.util.Scanner;

public class calculator {
    public static void main(String []args){
        System.out.println("Calculator in Java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the operation character");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            default:
            System.out.println("Unknown operation");
        }

    }
}

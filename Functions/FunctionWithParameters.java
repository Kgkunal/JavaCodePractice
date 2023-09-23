import java.util.Scanner;

public class FunctionWithParameters {

    // Declaration of function
    public static int Add(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String []args){
        System.out.println("Functions With Parameters");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Add(a, b);
        System.out.println("Addition is :" + sum);
    }
}

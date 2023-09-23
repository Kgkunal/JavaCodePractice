package FunctionOverloading;

public class UsingParameters {
    // Function to calculate sum of two numbers
    public static int sum(int a, int b){
        return a+b;
    }

    // Function to calulate sum of three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String []args){
        System.out.println("Sum of two :"+ sum(5,2));
        System.out.println("Sum of three :"+ sum(5,6,7));
        
    }
}

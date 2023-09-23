public class ProductFunction {

    // declarartion of function
    public static int multiply(int a , int b){
        int product = a*b;
        return product;

    }
    public static void main(String []args){
        System.out.println("Function to multiply two variables");
        int a = 5;
        int b = 10;
        int product = multiply(a,b);
        System.out.println("a * b :"+ product);

        // Example 2
        System.out.println("5 * 7 :"+ multiply(5, 7));
        
    }
}

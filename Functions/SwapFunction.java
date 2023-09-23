public class SwapFunction {

    // function declaration
    public static void Swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println("Value of a :"+a+"\n Value of b :"+b);
    }
    public static void main(String []args){
        System.out.println("Swap Function");
        int a = 10;
        int b = 90;
        Swap(a, b);
        

    }
}

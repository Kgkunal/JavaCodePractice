package FunctionOverloading;

public class UsingDatatypes {

    // Sum function for two integers
    public static int Sum(int a, int b){
        return (a+b);
    }

    // Sum function for two float numbers
    public static float Sum(float a, float b){
        return (a+b);
    }
  public static void main(String []args){
    System.out.println("Function overloading using Datatypes");
    System.out.println("Sum of integers :" + Sum(5,5));
    System.out.println("Sum of Float numbers :" + Sum( 1.5f ,1.5f));

  }  
}

public class largestof3 {
    public static void main(String []args){
        System.out.println("Print the Largest of 3 numbers problem");
        int a=5 , b=10 , c=3;
        if(a>=b && a>=c){
            System.out.println("Largest is A");
        }else if(b>=c){
            System.out.println("Largest is B");
        }else{
            System.out.println("Largest is C");
        }
    }
}

public class TernaryOperator {
    public static void main(String []args){
        System.out.println("Ternary Operator in Java");

        int number = 4;
        String type = ((number%2==0)? "Even" : "Odd");
        System.out.println("The number is"+ type);

    }
}

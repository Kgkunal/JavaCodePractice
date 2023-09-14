import java.util.Scanner;

public class positiveornegetiveproblem {
    public static void main(String []args){
        System.out.println("Number is Positive or Negative Problem \n Enter the number to check");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = ((number>=0)? "Positive" : "Negative");
        System.out.println("The number is " + result);
    }
}

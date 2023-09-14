import java.util.Scanner;

public class Ifelse{
    public static void main(String []args){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You age is  less than 18");
        }else{
            System.out.println("You age is greater or equal to 18");
        }
    }
}
import java.util.Scanner;

public class Incometaxproblem {
    public static void main(String []args){
        System.out.println("Enter Your Income");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income <= 5){
            System.out.println("Tax on income less than 5 lakh is 0");
        }else if(income > 5 && income <= 10){
            System.out.println("Tax on income 5 to 10 lakh is 10%");
        }else {
            System.out.println("Tax on income greater than 10 lakh is 30%");
        }
    }
}

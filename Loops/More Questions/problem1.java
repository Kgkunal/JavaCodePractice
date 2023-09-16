import java.util.Scanner;

public class problem1{
    public static void main(String []args){
        System.out.println("Problem : Read set of intergers and print the sum of Even and Odd integers");
        int integer ;
        int oddSum =0;
        int evenSum =0;
        int choice =0;

        do{
            System.out.println("Enter an integer");
            Scanner sc = new Scanner(System.in);
            integer= sc.nextInt();
            if(integer%2==0){
                evenSum += integer;
            }else{
                oddSum += integer;
            }

            System.out.println("Do you want to add more ? Press 1 , 0 to Print sum");
            choice = sc.nextInt();
        }while(choice == 1);
        
        System.out.println("Sum of Even numbers is :" + evenSum);
        System.out.println("Sum of odd numbers is :" + oddSum);
    }
}
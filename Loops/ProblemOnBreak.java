import java.util.Scanner;

public class ProblemOnBreak {
    public static void main(String []args){
        System.out.println("Problem statement : \n Keep entering numbers till user enters a multiple of 10 \n Enter Number please");
        Scanner sc = new Scanner(System.in);
        
        do{
            int number = sc.nextInt();
            if(number%10==0){
                break;
            }
            System.out.println("number is " + number );
        }while(true);

        System.out.println("Break encountered");
    

    }
}

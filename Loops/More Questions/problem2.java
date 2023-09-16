import java.util.Scanner;

public class problem2 {
    public static void main(String []args){
        System.out.println("Print multiplication table of a numbers \n Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println( number + "*" + i + "=" + (number*i));
        }

    }
}

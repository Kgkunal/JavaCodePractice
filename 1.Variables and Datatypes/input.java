import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(name + ", how are you today?");

        // integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered the number " + num);
    }
}

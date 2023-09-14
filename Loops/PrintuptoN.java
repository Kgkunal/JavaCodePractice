import java.util.Scanner;

public class PrintuptoN {
    public static void main(String []args){
        System.out.println("Print up to range");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.print(counter +" ");
            counter++;

        }
    }
}

import java.util.Scanner;

public class inputToArray {
    public static void main(String args[]){
        System.out.println("Input to Array");

        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("Chem :"+ marks[0] +"\n"+"phy :"+marks[1]+"\n"+"Eng :"+ marks[2]);
        System.out.println(marks.length);

    }
}

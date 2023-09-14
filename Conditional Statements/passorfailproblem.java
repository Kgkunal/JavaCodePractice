import java.util.Scanner;

public class passorfailproblem {
    public static void main(String []args){
        System.out.println("Check if a student is pass or fail Problem \n Enter the marks to check");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = ((marks>35)? "Pass" : "Fail");
        System.out.println("Student is" + result);
    }
}

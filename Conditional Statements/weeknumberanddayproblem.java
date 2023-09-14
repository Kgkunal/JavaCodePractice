import java.util.Scanner;

public class weeknumberanddayproblem {
    public static void main(String []args){
        System.out.println("Week number and day problem \n Enter the number 1-7");
        String day;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch(input){
            case 1:
            day = "Monday";
            System.out.println("Today is" + day);
            break;

            case 2:
            day = "Tuesday";
            System.out.println("Today is" + day);
            break;

            case 3:
            day = "wednesday";
            System.out.println("Today is" + day);
            break;

            case 4:
            day = "Thursday";
            System.out.println("Today is" + day);
            break;

            case 5:
            day = "Friday";
            System.out.println("Today is" + day);
            break;

            case 6:
            day = "Saturday";
            System.out.println("Today is" + day);
            break;

            case 7:
            day = "Sunday";
            System.out.println("Today is" + day);
            break;
        }

    }
}

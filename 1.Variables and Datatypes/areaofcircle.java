import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = 3.14f * radius * radius;
        System.out.println("The Are of Circle is "+ area);
    }
}

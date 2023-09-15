public class PrintReverseOfaNumber {
    public static void main(String []args){
        System.out.println("Print a revers of a Number");
        int num = 97647;
        int lastDigit;
        while(num>0){
            lastDigit = num%10;
            System.out.print(lastDigit);
            num = num/10;

        }
    }
}

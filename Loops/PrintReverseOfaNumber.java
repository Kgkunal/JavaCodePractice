public class PrintReverseOfaNumber {
    public static void main(String []args){
        System.out.println("Print a revers of a Number");
        int number = 92749749;
        int lastDigit = 0;
        while(number != 0){
            lastDigit = number%10;
            number = number/10;
            System.out.print(lastDigit);
        }
    }
}

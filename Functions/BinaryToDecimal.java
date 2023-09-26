public class BinaryToDecimal {

    // Function declarations
    public static void BinaryToDec(int num){
        int myNum = num;
        int BinaryNum = num;
        int Decimal = 0;
        int pow = 0;
        while(num>0){
            int lastDigit = num%10;
            Decimal += lastDigit*(int)(Math.pow(2, pow));
            pow++;
            num = num/10;
        }
        System.out.println("Decimal form :"+ Decimal);
    }
    public static void main(String []args){
        System.out.println("Convert Binary to Decimal");
        BinaryToDec(1010);
    }
}

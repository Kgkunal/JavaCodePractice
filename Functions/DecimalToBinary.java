public class DecimalToBinary {

    // Function declaration
    public static void DeciToBin(int num){
        int InitialNum = num;
        String BinNum = "";
        while(num>0){
            int rem = num%2;
             BinNum = rem+BinNum;
             num = num/2;

        }

        System.out.println("Decimal form : " + InitialNum + "\n" + " Binary form : " + BinNum);
    }
    public static void main(String []args){
        System.out.println("Decimal to binary conversion");
        DeciToBin(8);

    }
}

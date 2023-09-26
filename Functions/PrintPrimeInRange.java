public class PrintPrimeInRange {

    // Function to check number is prime or not
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return isPrime;

    }

    public static void PrintPrimeInRange(int n){
        for(int i=2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String []args){

        PrintPrimeInRange(30);
        
    }
}

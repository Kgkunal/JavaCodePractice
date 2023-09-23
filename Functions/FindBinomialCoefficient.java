public class FindBinomialCoefficient {

    // function for factorial 
    public static int factorial(int num){
        int factorial = 1;
        for(int i=1 ; i<=num ;i++){
            factorial *= i;
        }
        return factorial;
    }

    // Function to get binomial coefficient
    public static int binoCoeff(int num1 , int num2){
        int fact_num1 = factorial(num1);
        int fact_num2 = factorial(num2);
        int fact_num1Mnum2 = factorial(num1-num2);
        int binoCoeff = fact_num1/(fact_num2*fact_num1Mnum2);
        return binoCoeff;

    }
    public static void main(String []args){
        System.out.println("Function to get Binomial coefficient");
        int num1 = 10;
        int num2 = 5;
        System.out.println(binoCoeff(num1, num2));
    }
}

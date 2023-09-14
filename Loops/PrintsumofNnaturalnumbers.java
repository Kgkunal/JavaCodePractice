public class PrintsumofNnaturalnumbers {
    public static void main(String []args){
        System.out.println("Print sum of N natural numbers");
        int n = 5;
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum is : "+ sum);
    }
}

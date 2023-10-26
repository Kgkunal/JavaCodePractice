public class pairsInArrya {

    // function declaration
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+ numbers[j]+")");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Pairs in Array");

        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}

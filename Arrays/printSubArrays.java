public class printSubArrays {

    // function 
    public static void printSubArrays(int array[]){
        for(int i=0; i<array.length;i++){
            int start = i;
            for(int j=i;j<array.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(array[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Print sub-arrays");

        int numbers[] = {2,4,6,8,10};
        printSubArrays(numbers);
    }
}

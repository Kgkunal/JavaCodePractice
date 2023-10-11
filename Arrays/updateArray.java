public class updateArray {

    // Function to update the values of array. Taking array as an argument.
    public static void updateArray(int array[]){
        for(int i=0 ; i<array.length ; i++){
            array[i]= array[i]+10;
        
        }
        
    }

    // Function to print array
    public static void printArray(int array[]){
        for(int i=0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]){
        System.out.println("Arrays as function arguments and updation ");
        
        // Array 
        int Marks[] = {10,20,30};

        updateArray(Marks);
        printArray(Marks);


    }
}

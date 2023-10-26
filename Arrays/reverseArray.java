public class reverseArray {

    // function to print array
public static void printArray(int array[]){
    for(int i=0 ; i<=array.length-1;i++){
        System.out.print(array[i]);
    }
}

    // function to swap two numbers 
    public static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    // function to reverse an array
    public static void reverseArray(int array[]){
        int j=0 , i=array.length-1;
        while(j<i){
            swap(array[j] , array[i]);
            j++;
            i--;
        }
    
        printArray(array);
    }
    public static void main(String args[]){
        System.out.println("Reverse an array in java");
        
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Current Array");
        printArray(numbers);
        System.out.println("\n Array Now");
        reverseArray(numbers);
        
    

    }
}

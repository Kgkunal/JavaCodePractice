public class selectionSort {

    // function to print array 
    public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // selection sort implementaion
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            // Swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]= temp;
        }
    }
    public static void main(String args[]){
        System.out.println("Selection sort algoeithm");

        int arr[] = {5,4,1,3,2};
        System.out.println("Before sort");
        PrintArray(arr);
        System.out.println();
        System.out.println("After sort");
        selectionSort(arr);
        PrintArray(arr);
    }
}

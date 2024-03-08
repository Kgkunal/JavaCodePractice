public class binarySearch {

    // function declaration
    public static int binarySearch(int array[], int key){
        int start = 0 , end = array.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            System.out.println("value of mid here is = "+ mid);

            // comparisons

            if(array[mid] == key){
                return mid;
            }

            if(array[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        System.out.println("Binary Search Code");

        int numbers[]={11,22,34,46,52,67,71,86};
        int key = 52;

        System.out.println("Index for key : " + binarySearch(numbers, key));
    }
}

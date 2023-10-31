import java.util.Scanner;

public class FindLargestKey {

    // Function to find Largest key in matrix
    public static int largestKey(int[][] arr) {
        System.out.println();
        int max = 1;
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String args[]){

        // Matrix declaration
        int matrix[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);


        // Input Values into matrix
        for(int i=0; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j]= sc.nextInt();
            }
        } 

        // Display Matrix 
        for(int i=0; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        } 
        
        int LargeKey=largestKey(matrix);
        System.out.println("Largest is key in this matrix is "+LargeKey);
    } 
    
    

}

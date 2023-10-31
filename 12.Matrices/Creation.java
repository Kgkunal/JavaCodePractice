import java.util.Scanner;

public class Creation {

    // Search function to find key in Matrix
    public static boolean Search(int matrix[][],int key){
        for(int i=0; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if (matrix[i][j] == key) {
                    System.out.println("Key found at :"+i+","+j);
                return true;
                }
                
            }
        }

        System.out.println("Key not found");

        return false;
    }
    public static void main(String args[]){
        
        // Matrix declaration
        int Matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int n=Matrix.length;
        int m = Matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j]= sc.nextInt();
            }
        }

        // Print 2d Array
        System.out.println("Matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(Matrix[i][j]+" ");
            }

            System.out.println();
        }

        // Search Key in Matrix 
        Search(Matrix, 2);
    }
}

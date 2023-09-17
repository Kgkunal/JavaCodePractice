public class HalfPyramid {
    public static void main(String []args){
        System.out.println("Print Half Pyramid Pattern");

        for(int i=1 ; i<11 ;i++){
            for(int j=1; j<=i ; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}

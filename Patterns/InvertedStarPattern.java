public class InvertedStarPattern {
    public static void main(String []args){
        System.out.println("Inverted Star Pattern");
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=4-i+1 ;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

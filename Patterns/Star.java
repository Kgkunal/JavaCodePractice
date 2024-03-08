public class Star {
    public static void main(String []args){
        System.out.println("Star Patttern using Nested For Loops");
        for(int i=1 ; i<=10 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

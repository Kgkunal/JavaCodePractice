public class hollowRectangle {

    // function declaration;
    public static void hollow_Rectangle(int rowsNum , int colNum){
        for(int i=1 ; i<=rowsNum ; i++){
            for(int j=1 ; j<=colNum ; j++){
                if(i==1 || i==rowsNum || j==1 || j==colNum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String []args){
        hollow_Rectangle(5, 30);

    }
}

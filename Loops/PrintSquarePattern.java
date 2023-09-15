public class PrintSquarePattern {
    public static void main(String []args){
        System.out.println("Print Square Pattern in Java");
        int lines=4;

        System.out.println("Pattern using For Loop");
        for(int i=1; i<=lines;i++){
            System.out.println("****");
        }

        System.out.println("Pattern using While Loop");
        int i =1;
        while(i<=lines){
            System.out.println("****");
            i++;
        }
    }
}

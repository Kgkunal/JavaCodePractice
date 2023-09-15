public class BreakStatement {
    public static void main(String []args){
        for(int i=1; i<5 ; i++){
            System.out.println("For Loop Iteration no: " + i);
            if(i==3){
                System.out.println("Break from if condition (i=3)");
                break;
            }
        }
        System.out.println("Out of the Loop");
    }
}

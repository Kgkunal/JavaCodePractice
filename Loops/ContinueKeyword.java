public class ContinueKeyword {
    public static void main(String []args){
        System.out.println("Continue keyword is use to Skip the loop iteration on given condition");
        for(int i=1 ; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.println("Iteration number :" + i);

        }
    }
}

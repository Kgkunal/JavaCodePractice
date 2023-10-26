public class LinearSearch {

    public static int LinerSearch(int number[],int key){

        for(int i=0; i < number.length ; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int index = LinerSearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at : "+ index + " " +"Position in Array");
        }
    }
}

public class LinearSearch {

    // function
    public static int Kunal(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }else{
                return -1;
            }
        }
        return 0;
    }
    public static void main(String args[]){

        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        int index = Kunal(numbers[10],key);
        if(index==-1){
            System.out.println("Not hold in array");
        }else{
            System.out.println(key + "Hold at index : "+index);
        }
    }
}

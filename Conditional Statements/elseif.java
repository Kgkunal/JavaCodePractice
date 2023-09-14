public class elseif {
    public static void main(String []args){
        System.out.println("Else-if conditional statements");
        int age = 17;
        if(age<=15){
            System.out.println("You are a Kid ad age is less than 15");
        }else if(age>15 && age<=18){
            System.out.println("You are a teenager and between 16-18");
        }else{
            System.out.println("You age is greater than 18");
        }
    }
}

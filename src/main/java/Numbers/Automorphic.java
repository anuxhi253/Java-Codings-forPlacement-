package Numbers;
public class Automorphic {
    public static void main(String[] args){
        int integer=6;
        int square=integer*integer;
        int digit=0;
        if(square>0){
           digit=square%10;
        }
        if(integer==digit){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}




import java.util.Scanner;

public class factorial {
    public static void main (String[] args){
        
        // factorial of N numbers
        Xactorial(5);



    }

    public static void Xactorial(int a){

        int fact = 1;
        int pdt = 1 ;

        while (fact <= a){
            pdt = fact*pdt;
            fact++;
            
            
        }

        System.out.println( pdt);

    }
    
}

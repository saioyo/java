public class COMPOUNDINTEREST {
    public static void compoundintrest(int a, int b, int c){

        int i = 0;
        int total = a;
        while(i <=c ){

            int x = total/100*b;
            total = total + x;
            i++ ;
        }
        System.out.println(total);


    }
    public static void main(String[] args) {
        compoundintrest(1000, 10, 10);
    }
    
}

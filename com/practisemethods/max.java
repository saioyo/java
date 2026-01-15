package practisemethods;

public class max {
    public static void Max(int a , int b, int c){

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        Max(5, 69, 7);
    }
    
}

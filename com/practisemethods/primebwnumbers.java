package practisemethods;

public class primebwnumbers {
    public static void prime(int a , int b){
        for (int n = Math.max(2,a); n <=b;n++){
            boolean prime = true;
            for(int i = 2; i*i <= n;i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
        
        if (prime) System.out.print(n + "  ");
        }
    }

    public static void main(String[] args) {
        prime(5, 10);
    }
}
public class SUMOFDIGIT {
    public static void main(String[] args) {
        // sum of digit

        SUMOF(12345);

    }

    public static void SUMOF(int a){
        

        int n = a;
        int num = 0;
        while(n>0){
            int rem = n % 10;
            num = num + rem;
            n = n/10;
        }
        System.out.println(num);







    }
    // public static void SUMOF(int a){

    //     int[] digits = new int[a.length()];
    //     for (int i = -1; i<a.length(); i--){
    //         System.out.println(i);

    //     }
        }
    
    


public class CGPA {
    public static void main(String[] args) {
        
        //CGPA calculate
        cgpa(12,34,35);

    }
    public static void cgpa(int ...v){
        int sum=0;
        int avg = 0;

         for(int price:v){
            sum += price;
        }
        avg = sum/v.length ;
        System.out.println(avg);
    }
    
}

public class SUMOFRANDOM {
    public static void main(String[] args) {

        sumofrandom(12,34,-45,-56,67,78,89,90);
        
    }
    public static void sumofrandom(int ...v){
        

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int i = 0;

        while(i <v.length){
            int nums = v[i];

            if(nums < 0){
                sum1 += nums;
                
            }else if(nums%2 ==0){
                sum2 += nums;
                
            }else{
                sum3 += nums;
            }
            i++;
        }
        System.out.println("sum of neg"+sum1);
        System.out.println("sum of even"+sum2);
        System.out.println("sum of odd"+sum3);
    }
}

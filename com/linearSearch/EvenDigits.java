public class EvenDigits {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,896};
        System.out.println(findNumbers(nums));

        
    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(evenD(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean evenD(int num){
        int FindDigit = Digits(num);
        if(FindDigit % 2 == 0){
            return true;
        }
        return false;
    }
    public static int Digits(int num){
        int count = 0;
        if(num<0){
            num = num*-1;
        }
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    
}

public class MAxWealth {
    public static void main(String[] args) {
        int [][]accounts={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(maximunWealth(accounts));
        
    }
    
    public int maximunWealth(int[][] accounts){
        //person = row
        //accounts = col
        int ans = Integer.MIN_VALUE;
        for(int[] ints: accounts){
            //when you start a new col,taek new sum for that row
            int sum = 0;
            for(int anInt:ints){
                sum += anInt;
            }
            //now we have sum of accounts of person
            // check with overall ans
            if (sum> ans){
                ans = sum;
            }
        }
        return ans;
    }
}

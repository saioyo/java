public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int []arr = {7,2,5,10,8};
        int m = 2;
        int ans = splitArray(arr, m);
        System.out.println(ans);
        
    }
    public static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);// in the end of the loop this will contain the max item from the array
            end += nums[i];
        }
        //binary search
        while(start < end){
            // try for the middle for potential as
            int mid = start + (end-start)/2;
            //calculate the how many pieces you can divide this in this in with this max sum
            int sum = 0;
            int pieces=1;
            for (int num: nums){
                if (sum +num > mid){
                    // you cannot add this in this subarrays.make new one
                    // say you add this num in new subarray.them sum = num
                    sum = num;
                    pieces++;

                }else{
                    sum += num;
                }
            }
            if(pieces >m){
                start = mid +1;
            }else{
                end = mid;                                                                             
            }
        }
    }
}

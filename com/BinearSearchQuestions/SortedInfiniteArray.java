public class SortedInfiniteArray {
    public static void main(String[] args) {
        int []arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target =10;
        System.out.println(ans(arr, target));
        
    }
    public static int ans(int[] arr, int target){
        //first find the range
        // first start with a box of size 2

        int s = 0;
        int e = 1;
        // condition for the target to lie in the range
        while(target > arr[e]){
            int NewS = e + 1;
            //double the box value
            // end = previous end + sizebox*2
            e = e + (e - s + 1) * 2 ;
            s = NewS;
        }
        return BinarySearch(arr, target,s,e);

    }


    public static int BinarySearch(int[]arr,int target,int s,int e) {

        while(s<=e){
            int mid = s + (e-s)/2 ;
            if(target < arr[mid]){
                e = mid-1;
            }else if (target > arr[mid]){
                s = mid + 1;
            }else{
                return mid;
            }
            
        }
        return -1;

    }
    

    
}

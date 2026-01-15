

public class binearSearch {
    public static void main(String[] args) {
        int[]arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 16;
        System.out.println(BinearSearch(arr, target));
        
    }
    // return the index
    public static int BinearSearch(int[]arr,int target) {

        int s = 0;
        int e = arr.length - 1;
        
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

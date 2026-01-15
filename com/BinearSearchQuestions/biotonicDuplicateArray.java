public class biotonicDuplicateArray {
    public static void main(String[] args) {
        
    }

    public static int Search(int []arr,int target){
        int peak = PeakMountain(arr);
        int firstTry = BinarySearch1(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return BinarySearch1(arr, target,peak+1,arr.length -1);



    }
     public static int BinarySearch1(int[]arr,int target,int s,int e) {
        
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
      public static int BinarySearch2(int[]arr,int target,int s,int e) {


        while(s<=e){
            int mid = s + (e-s)/2 ;
            if(target < arr[mid]){
                s = mid+1;
            }else if (target > arr[mid]){
                e = mid - 1;
            }else{
                return mid;
            }
            
        }
        return -1;


    
}
public static int PeakMountain(int []arr){
        int s = 0;
        int e = arr.length -1;

        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is wahy e != mid -1
                e = mid;
            }else{
                // you are in asc part of array
                s = mid +1;//because we know that mid+1 element
            }

        }
        // in the e, s == e and pointing to the largest number because of the 2 checks above
        //s and e are always trying to find max element that is the max one beacus that is what the checks say
        //more elaboration : at every point of time for s and e, they have the best possible ans till that point
        // and if we are saying that only one item is remainin, hence cuz of above line that is the best possible ans
        return s; //or e both are same
    }
}

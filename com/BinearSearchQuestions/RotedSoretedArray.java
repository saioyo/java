public class RotedSoretedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        
        int ans = search(arr, 6);
        System.out.println(ans);

        
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        // if you not find a pivot , it means the array is not rotated
        if(pivot == -1){
            return BinarySearch1(arr, target, 0,arr.length - 1);

        }
        // if pivot is found , you have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }
        if(target>=arr[0]){
            return BinarySearch1(arr, target, 0, pivot -1);
        }else{
            return BinarySearch1(arr, target, pivot + 1, arr.length -1);
        }

    }// this will not work in duplicate valie
    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s)/2;
            // 4 cases over here
            if(mid < e && arr[mid] >  arr[mid + 1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid]<= arr[s]){
                e = mid -1;
            }else{
                s = mid + 1;
            }

            
        }
        return -1;
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
    
}

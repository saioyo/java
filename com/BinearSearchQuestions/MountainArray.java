public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        int target = 2;
        int s = 0;
        int e = arr.length -1;
        int ans = FinalBinary(arr, target,s,e);
        System.out.println(ans);

        
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
public static int FinalBinary(int[]arr,int target,int s,int e){
    int mid = s + (e-s)/2;
    if(target>arr[mid]){
        while(target==arr[mid]){
            e = mid +1;
        }
        return BinarySearch1(arr, target, s, e);
    }
    if(target<arr[mid]){
        while(target==arr[mid]){
            e = mid - 1;
        }
        return BinarySearch2(arr, target, s, e);

    }
    int peak = s; // or e (both same)

    //  search in ascending part
    int firstTry = BinarySearch1(arr, target, 0, peak);
    if (firstTry != -1) {
        return firstTry;
    }

    //  search in descending part
    return BinarySearch2(arr, target, peak + 1, arr.length - 1);
}
}
    
    

    
    


public class TimesRotated {
    public static void main(String[] args) {
        int[]arr ={2,3,6,12};
        System.out.println(Rotation(arr));
        
    }
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
    public static int Rotation(int[]arr){
        int pivot = findPivot(arr);
        // if(pivot == -1){
        //     // array is not rotated
        //     return 0;
        // }
        return pivot + 1;
    }
}

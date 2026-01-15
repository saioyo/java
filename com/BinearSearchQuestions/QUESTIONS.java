public class QUESTIONS {
    public static void main(String[] args) {
        int[]arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = Ceiling(arr, target);
        System.out.println(ans);

    }
    public static int Ceiling(int[]arr,int target) { //just take code as it and change funtion name to flooe

        int s = 0;
        int e = arr.length - 1;

        if(target > arr[arr.length -1]){
            return-1;
        }
        
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
        return s;
        // for floor return e
        //greatest number smaller or equal to target number;

    }
    
        
        
    
    
}

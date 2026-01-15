import java.util.Arrays;

public class SearchInRange {public static void main(String[] args) {

    int [] arr = {18,12,-7,3,14,28};
    int target = 18;
    int ans = linearSearch(arr,target, 1, 5);
    System.out.println(ans);
}
public static int linearSearch(int[]arr,int target,int start,int end){
        
        if(arr.length == 0){
            return -1;
        }

         for(int index = start; index <= end;index++){
            
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    
}

public class MountainArray2 {
    public static void main(String[] args) {
        
    }
    public static int PeakMountain(int []arr){
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is wahy end != mid -1
                end = mid;
            }else{
                // you are in asc part of array
                start = mid +1;//because we know that mid+1 element
            }

        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element that is the max one beacus that is what the checks say
        //more elaboration : at every point of time for start and end, they have the best possible ans till that point
        // and if we are saying that only one item is remainin, hence cuz of above line that is the best possible ans
        return start; //or end both are same
    }
    
}

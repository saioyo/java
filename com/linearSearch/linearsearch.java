public class linearsearch {
    public static void main(String[] args) {
        
        int[] arr = {18,12,9,14,77,50};
        int target = 50;
        // find whether 14 exists in array or not
        boolean ans = linearSearch(arr, target);
        System.out.println(ans);

        
    }
    //search in the array : return the index if item found
    // ohterwisse if item not found retyrn -1

    static boolean linearSearch(int[] arr, int target) {

        if (arr.length == 0){
            return false;
        }

        // run a for loop
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        // this line will execute if none of the return statements above have excute
        // hence the target not found
        return false;

    }
    
}

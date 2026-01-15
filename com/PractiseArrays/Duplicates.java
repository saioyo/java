package PractiseArrays;

import java.util.Arrays;

public class Duplicates {
    
    public static void main(String[] args) {
        // Test array (must be sorted for this algorithm to work correctly)
        int[] nums = {1, 2, 34, 34, 34, 343, 343, 4343};
        
        System.out.println("Before: " + Arrays.toString(nums));
        
        int newLength = removeDuplicates(nums);
        
        System.out.println("After : " + Arrays.toString(nums));
        System.out.println("New length = " + newLength);
        
        // Optional: Print only the unique part
        System.out.print("Unique elements: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static int removeDuplicates(int[] nums) {
        // Edge cases
        if (nums == null || nums.length <= 1) {
            return nums == null ? 0 : nums.length;
        }
        
        int write = 1;  // position where next unique element will be placed
        
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }
        
        return write;
    }
}
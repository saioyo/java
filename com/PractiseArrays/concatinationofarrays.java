package PractiseArrays;

import java.util.Arrays;

public class concatinationofarrays {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int[]b = {7,8,9,10};

        int[] result = new int[a.length + b.length];
        
        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);

        System.out.println(Arrays.toString(result));
        
    }
    
}

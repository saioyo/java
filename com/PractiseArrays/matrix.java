package PractiseArrays;

import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
    
    
    int [][]matrix = new int [3][3];

    int count = 1;
    for(int i = 0; i < matrix.length; i ++){
        for(int j = 0; j < matrix[i].length; j++){
            matrix[i][j] = count++;
            
        }
    }
    for(int i = 0;i< matrix.length; i ++){
        System.out.println(Arrays.toString(matrix[i]));
    }
}
}

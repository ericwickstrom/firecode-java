/*
 * You are given an m x n 2D image matrix where each integer 
 * represents a pixel. Flip it in-place along its horizontal axis.
 */

import java.util.*;
 
 public class FlipHorizontal {
    private static void flip(int[][] matrix){
        if(matrix != null && matrix.length > 1){
            for(int i = 0; i < matrix[0].length; i++){
                int top = 0;
                int bottom = matrix.length-1;
                while(top < bottom){
                    int temp = matrix[top][i];
                    matrix[top][i] = matrix[bottom][i];
                    matrix[bottom][i] = temp;
                    top++;
                    bottom--;
                }
            }
        }
    }

    private static void print(int[][] matrix){
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }
        System.out.println("");
    }

    // Test cases
    public static void main(String[] args){
        int[][] test1 = {{1,2,3}    // 7,8,9
                        ,{4,5,6}    // 4,5,6
                        ,{7,8,9}};  // 1,2,3
    
        int[][] test2 = {{1,0}};    // 1,0
        
        int[][] test3 = {{1}};      // 1

        int[][] test4 = {{1,0,1}    // 1,0,1
                        ,{1,0,1}};  // 1,0,1
    
        int[][] test5 = {{1,0,0}    // 0,0,1
                        ,{0,0,1}};  // 1,0,0

        flip(test1);
        print(test1);

        flip(test2);
        print(test2);

        flip(test3);
        print(test3);

        flip(test4);
        print(test4);

        flip(test5);
        print(test5);
    }
 }
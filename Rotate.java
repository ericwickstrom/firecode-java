import java.util.*;
public class Rotate {
    public static void rotateSquareImageCW(int[][] matrix) {
        // transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i < j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // flip
        int i = 0;
        for(int[] a : matrix){
            int front = 0;
            int back = a.length - 1;
            while(front < back){
                int temp = a[front];
                a[front] = a[back];
                a[back] = temp;
                front++;
                back--;
            }

            matrix[i] = a;
            i++;
        }

        print(matrix);
    }

    public static void print(int[][] a){
        for(int[] i : a){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args){
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        /*
            1 4 7
            2 5 8
            3 6 9
        */
        rotateSquareImageCW(a);
     //   print(a);

        /*
        int[][] b = {
            {1,2,3},
            {4,5,6}
        };

        rotateSquareImageCW(b);
        */
    }
}
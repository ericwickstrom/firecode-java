import java.util.Arrays;


public class TransposeMatrix {
    public static void transpose(int[][] matrix){
        int swaps = 0;
        for(int i = 0; i < matrix.length-1; i++){
            for(int j = i + 1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
                swaps++;   
            }
        }
        System.out.println("swaps: " + swaps);
    }

    private static void print(int[][] array){
        for(int[] a : array){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int[][] test1   = {{1,0,1}
                          ,{1,0,1}
                          ,{1,0,1}};
        int[][] t1r     = {{1,1,1}
                          ,{0,0,0}
                          ,{1,1,1}};

        transpose(test1);
        print(test1);

        for(int i = 0; i < test1.length; i++){
            System.out.print(test1[0][i]);
        }
    }
}
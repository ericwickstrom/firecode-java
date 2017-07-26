// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class EquilibriumIndex {
    public static int solution(int[] A) {
        // write your code in Java SE 8

        for(int i = 0; i < A.length; i++){
            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j < i; j++){
                if(i != j) {
                    sum1 += A[j];    
                }
            }

            for(int k = i + 1; k < A.length; k++){
                sum2 += A[k];
            }
            
            if(sum1 == sum2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};

        System.out.println(solution(a)); 
    }
}
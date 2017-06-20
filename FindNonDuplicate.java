
public class FindNonDuplicate {
    public static void main(String[] args){
        int[] test1 = {1,1,1,4,5,6,7,7,6,4}; // 5
        int[] test2 = {1,2,3,3,2,1,7,8,8}; // 7
        int[] test3 = {1,2,3,4,1,2,4,3,5}; //5
        int[] test4 = {1,-1,1}; // -1
        int[] test5 = {1};//
    
        System.out.println("Should equal 5: " + findNum(test1));
        System.out.println("Should equal 7: " + findNum(test2));
        System.out.println("Should equal 5: " + findNum(test3));
        System.out.println("Should equal -1: " + findNum(test4));
        System.out.println("Should equal 1: " + findNum(test5));
    }

    public static int findNum(int[] A){
        if(A.length == 1){
            return A[0];
        }
        int j = A[0];
        for(int i = 1; i < A.length; i++){
            j = j ^ A[i]; 
        }
        return j;
    }
}
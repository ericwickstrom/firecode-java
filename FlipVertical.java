public class FlipVertical {
    public static void main(String[] args){
        int[][] test1 = {{1,0,0}, {0,0,1}};
        int[][] test1ans = {{0,0,1},{1,0,0}};

        int[][] test2 = {{1,0,1}, {1,0,1}};
        int[][] test2ans = {{1,0,1}, {1,0,1}};

        int[][] test3 = {{1},{}};
        int[][] test3ans = {{1},{}};

        int[][] test4 = {{1,2,3}
                        ,{4,5,6}
                        ,{7,8,9}};
        int[][] test4ans = {{3,2,1},{6,5,4},{9,8,7}};      

        System.out.println("*** Test 1 ***");
        System.out.println(print(test1ans));
        flip(test1);
        System.out.println(print(test1));


        System.out.println("*** Test 2 ***");
        System.out.println(print(test2ans));
        flip(test2);
        System.out.println(print(test2));
/*
         System.out.println("*** Test 3 ***");
        System.out.println(print(test3ans));
        flip(test3);
        System.out.println(print(test3));
*/
        System.out.println("*** Test 4 ***");
        System.out.println(print(test4ans));
        flip(test4);
        System.out.println(print(test4));

    }

    public static void flip(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            int i = 0;
            int j = matrix[0].length-1;
            while(i < j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }
        }
    }

    private static String print(int[][] matrix){
        

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
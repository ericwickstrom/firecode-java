import java.util.Arrays;
public class BubbleSort {
    public static int[] sort(int[] arr){
        if(arr != null && arr.length > 2){
            boolean swap = false;
            do {
                swap = false;
                for(int i = 0; i < arr.length-1; i++){
                    if(arr[i] > arr[i+1]){
                        swap = true;
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp; 
                    }
                }

            } while(swap);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] test1 = {};
        int[] test2 = {10,9,8,7,6,5,4,3,2,1};
        int[] test3 = {1,2,3,4,5};
        int[] test4 = {1};

        sort(test1);
        System.out.println(Arrays.toString(test1));

        sort(test2);
        System.out.println(Arrays.toString(test2));        

        sort(test3);
        System.out.println(Arrays.toString(test3));

        sort(test4);
        System.out.println(Arrays.toString(test4));



    }
}
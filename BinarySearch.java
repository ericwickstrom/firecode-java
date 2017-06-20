/*
 * Array: {2}
Element to be searched: 2
true
Array: {2,5,7,9,12}
Element to be searched: 8
false
Array: {2,5,7,9,12}
Element to be searched: 2
true
Array: {2}
Element to be searched: 4
false
Array: {2,5,7,9,12}
Element to be searched: 12
true
Array: [Empty]
Element to be searched: 4
false
Array: {2,5,7,8,9,12}
Element to be searched: 8
true
 */

import java.util.*;

public class BinarySearch {
    private static boolean search(int[] arr, int n){
        if(arr != null){
            int lo = 0;
            int hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if(n < arr[mid]) {
                    hi = mid - 1;
                }
                else if (n > arr[mid]) {
                    lo = mid + 1;
                }
                else return n == arr[mid];
            }
        }
        return false;
    }

    private static void test(int[] arr, int n, boolean result){
        boolean search = search(arr, n);
        String str;
        if(search == result){
            str = "correct";
        } else {
            str = "fail";
        }   
        System.out.println(Arrays.toString(arr) + ", " + n + ": " + str);
    }

    public static void main(String[] args){
        int[] test1 = {2};
        int search1 = 2;
        boolean result1 = true;

        int[] test2 = {2,5,7,9,12};
        int search2 = 8;
        boolean result2 = false;

        test(test1, search1, result1);
        test(test2, search2, result2);
    }
}
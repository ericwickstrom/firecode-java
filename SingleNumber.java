/*
 * Write a method that returns a number that appears only once 
 * in an array.
 * Assume the array will surely have a unique value. 
 * The array will never be empty.
 */

import java.util.HashMap;

public class SingleNumber {

    public static int find(int[] arr){
        // true = only value, false = multiple values
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] test1 = {1,2,3,4,1,2,4,3,5}; // 5
        System.out.println("Should be 5: " + (5 == find(test1)));
    }
}
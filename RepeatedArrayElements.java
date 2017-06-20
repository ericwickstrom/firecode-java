import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class RepeatedArrayElements {
    public static String duplicate(int[] numbers){
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int num : numbers){
            if(map.containsKey(num)){
                map.put(num, false);
            } else {
                map.put(num, true);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()){
            if(!map.get(i)){
                list.add(i);
            }
        }

        if(list.size() == 0){
            return "[Empty]";
        }

        return list.toString();
    }
    
    
    public static void main(String[] args){
        int[] test1 = {1,3,3,4}; //[3]
        int[] test2 = {4}; //[Empty]
        int[] test3 = {1,5,23,2,6,3,1,8,12,3}; // [1,3]
        int[] test4 = {4,3,1}; //[Empty]

        System.out.println(Arrays.toString(test1) + " should be [3]: " + duplicate(test1));
        System.out.println(Arrays.toString(test2) + " should be [Empty]: " + duplicate(test2));
        System.out.println(Arrays.toString(test3) + " should be [1,3]: " + duplicate(test3));
        System.out.println(Arrays.toString(test4) + " should be [Empty]: " + duplicate(test4));

    }
}
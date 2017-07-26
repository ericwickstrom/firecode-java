import java.util.*;
public class FindSingle {
    public static int singleNumber(int[] A) {
    if(A.length == 0) return A[0];   
    
    Map<Integer, Boolean> map = new HashMap<>();
    
    // true = single entry
    // false = duplicate entry
    for(int i : A){
        if(map.containsKey(i)){
            map.put(i, false);
        } else {
            map.put(i, true);
        }
    }
    
    Set<Integer> set = A.keySet();
    for(int i : set){
        if(map.get(i)){
            return i;
        }
    }
    return 0;
    }


}
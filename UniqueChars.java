import java.util.*;

public class UniqueChars {
    public static boolean test(String str){
        if(!(str == null || str.length() == 0)){
            Set<Character> set = new HashSet<>();
            for(char c : str.toLowerCase().toCharArray()){
                if(!set.add(c)){
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args){
        String test1 = "abcdefg"; // true
        String test2 = "abcdefga"; // false

        System.out.println(test1 + ": " + (true == test(test1)));
        System.out.println(test2 + ": " + (false == test(test2)));
    }
}
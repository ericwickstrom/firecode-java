
/*
 *  Find the first non-duplicate character in a string. Return null if no unique character is found. 
    firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
    firstNonRepeatedCharacter( "cbcd" ) --> 'b'
    firstNonRepeatedCharacter( "cdcd" ) --> null
*/
import java.util.*;

public class FirstNonRepeatedCharacter {
    public static Character find(String str) {
/* First solution

        if(str == null) return null;
        if(str.length() == 1) return new Character(str.charAt(0));
        char[] letters = str.toLowerCase().toCharArray();
        int[] sum = new int[letters.length];
        int pos = 0;
        while(pos < letters.length){
            for(int i = 0; i < letters.length; i++){
                if(letters[pos] == letters[i]){
                    sum[pos]++;                
                }
            }
            pos++;
        }

        for(int i = 0; i < sum.length; i++){
            if(sum[i] == 1){
                return new Character(letters[i]);
            }
        }

        return null;
*/

        if(str == null || str.length() == 0) return null;
        if(str.length() == 1) return str.charAt(0);

        char[] letters = str.toLowerCase().toCharArray();
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        
        for(int i = 0; i < letters.length; i++){
            if(!map.containsKey(letters[i])){
                map.put(letters[i], false);
            } else {
                map.put(letters[i], true);
            }
        }

        for(Character key: map.keySet()){
            if(!map.get(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String args[]){
        String test1 = "aaaa"; // null
        String test2 = "b"; // b
        String test3 = "abcdcd"; // a
        String test4 = "aabcdc"; // b
        String test5 = "aabcbcd"; // d

        System.out.println(test1 + ": " + find(test1));
        System.out.println(test2 + ": " + find(test2));
        System.out.println(test3 + ": " + find(test3));
        System.out.println(test4 + ": " + find(test4));
        System.out.println(test5 + ": " + find(test5));
    }

}


/*
 * Implement a method that checks if two strings are permutations of each other. 
 * Perumtation contains all characters but possibly in a different order.
 * ie: DOG, GOD is true
 * ie: aaaa, bbbb is false
 */

public class Permutation {
    public static boolean check(String str1, String str2){
        int[] chars1 = new int[256];
        int[] chars2 = new int[256];

        for(char c : str1.toCharArray()){
            chars1[c]++;
        }

        for(char c : str2.toCharArray()){
            chars2[c]++;
        }

        for(int i = 0; i < 256; i++){
            if(chars1[i] != chars2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){
        // true
        Boolean test1 = true;
        String test1a = "firecode"; 
        String test1b = "codefire";
        
        // true
        Boolean test2 = true;
        String test2a = "DOG";
        String test2b = "GOD";

        // false
        Boolean test3 = false;
        String test3a = "bbbb";
        String test3b = "dddd";

        // true
        Boolean test4 = true;
        String test4a = "abc";
        String test4b = "abc";

        // false
        Boolean test5 = false;
        String test5a = "abcd";
        String test5b = "abc";

        // false
        Boolean test6 = false;
        String test6a = "firecode";
        String test6b = "firecoat";

        System.out.println(test1a + " " + test1b + ": " + (test1 == check(test1a, test1b)));
        System.out.println(test2a + " " + test2b + ": " + (test2 == check(test2a, test2b)));
        System.out.println(test3a + " " + test3b + ": " + (test3 == check(test3a, test3b)));
        System.out.println(test4a + " " + test4b + ": " + (test4 == check(test4a, test4b)));
        System.out.println(test5a + " " + test5b + ": " + (test5 == check(test5a, test5b)));
        System.out.println(test6a + " " + test6b + ": " + (test6 == check(test6a, test6b)));
    }
}
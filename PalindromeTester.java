public class PalindromeTester {
    private static boolean test(String str){
        if(str == null || str.length() == 0) return true;
        
        char[] letters = str.toLowerCase().toCharArray();
        int first = 0;
        int last = letters.length-1;
        while(first <= last){
            if(letters[first] != letters[last]){
                return false;
            }
            first++;
            last--;
        }
         return true;

    }
    
    public static void main(String[] args){
        String test1 = "abcdcba"; // true
        String test2 = ""; // true
        String test3 = "abcdabcd"; // false
        String test4 = "abcddcba"; // true

        System.out.println(test1 + ": " + (test(test1) == true));
        System.out.println(test2 + ": " + (test(test2) == true));
        System.out.println(test3 + ": " + (test(test3) == false));
        System.out.println(test4 + ": " + (test(test4) == true));
    }
}
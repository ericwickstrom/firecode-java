/*
 * Write a method to replace all spaces in a string with a given replacement string,
 * without using String.replace()
 */

public class Replace {
    
    private static String r(String a, String b){
        if(a == null || a.length() == 0) return "";
        StringBuilder sb = new StringBuilder(a);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' '){
                sb.replace(i, i+1, b);
                i = i + b.length();
            }
        }
        return sb.toString();
    }

    //tests
    public static void main(String[] args){
        String a = null;
        System.out.println(r("This is a test", "ABC"));
    }
}
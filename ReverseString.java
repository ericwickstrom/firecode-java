/*
 *   Write a method that takes in a String and returns the reversed version of the String.
 */
import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        if(str == null) return null;
        char[] letters = str.toCharArray();
        int i = 0;
        int j = letters.length-1;
        while(i < j){
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            i++;
            j--;
        }
        return new String(letters);
    }

    // Tests
    public static void main(String[] args){
        try {
            System.out.println("a should be a: " + reverseString("a"));
           // System.out.println("null should be null: " + reverseString(null));
            System.out.println("empty should be empty: " + reverseString(""));
            System.out.println("abcd should be bcda: " + reverseString("abcd"));
            System.out.println("abcde should be edcba: " + reverseString("abcde"));
        } catch (Exception e){

        }
            
    }
}
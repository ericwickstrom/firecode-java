public class IntegerPalindrome {
    public static boolean check(int i){
        if(i < 0){
            return false;
        } else if(i < 10){
            return true;
        }

        int n = i;
        int r = 0;
        while(n > 0){
            r = r * 10 + n % 10;
            n = n/10;
        }

        return i == r;
    }


    public static void main(String[] args){
        int test1 = -1;
        boolean test1r = false;

        int test2 = 0;
        boolean test2r = true;

        int test3 = 1221;
        boolean test3r = true;

        // maximum integer value
        int test4 = 2147483647;

        System.out.println(test1 + ": " + (test1r == check(test1) ? "passed" : "failed"));
        System.out.println(test2 + ": " + (test2r == check(test2) ? "passed" : "failed"));
        System.out.println(test3 + ": " + (test3r == check(test3) ? "passed" : "failed"));
        System.out.println(check(test4));
    }
}
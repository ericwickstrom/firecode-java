public class ReverseInt {
    public static int reverseInt(int x) {
        //if(x < 10 && x > -10) return x;

        int r = 0;
        while(x != 0){
            r = r * 10 + x % 10;
            x = x / 10;
        }

        return r;
    }

    public static void main(String[] args){
        int test1 = 0;
        int test1r = 0;
        int test2 = -123;
        int test2r = -321;
        int test3 = 123;
        int test3r = 321;

        System.out.println(test1 + ": " + (test1r == reverseInt(test1) ? "passed" : "failed"));
        System.out.println(test2 + ": " + (test2r == reverseInt(test2) ? "passed" : "failed"));
        System.out.println(test3 + ": " + (test3r == reverseInt(test3) ? "passed" : "failed"));
    }
}
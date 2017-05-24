/*
    The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
    The next number is found by adding up the two numbers before it.
    Write a recursive method fib(n) that returns the nth Fibonacci number. 
    n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., 
    n == 0 should return 0 and n == 3 should return 2. Assume n is less than 15.
    Even though this problem asks you to use recursion, more efficient ways to solve it include using an Array, 
    or better still using 3 volatile variables to keep a track of all required values. 
    Check out this blog post to examine better solutions for this problem.
*/

public class Fib {
    public static int fib(int n) {
        if(n <= 1){
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    // tests
    public static void main(String[] args){
        System.out.println("N = 0, should be 0: " + fib(0));
        System.out.println("N = 1, should be 1: " + fib(1));
        System.out.println("N = 2, should be 1: " + fib(2));
        System.out.println("N = 6, should be 5: " + fib(8));
    }
}
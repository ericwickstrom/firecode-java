/*
 *
 * Write a method - pow(x,n) that returns the value of 
 * x raised to the power of n (xn). n can be negative!
 */

import java.math.*;

public class Power {
    public static double pow(double x, int n) {
        if(n == 1) return x;
        if(n < 0){
            return 1 / pow(x, - n);
        } 
        return x * pow(x, n-1);
    }

    public static void main(String[] args){
        System.out.println("2, 3: " + (pow(2,3) == Math.pow(2, 3)));
        System.out.println("-2, 3: " + (pow(-2,3) == Math.pow(-2, 3)));
        System.out.println("2, -3: " + (pow(2,-3) + " " + Math.pow(2, -3)));
    }
}
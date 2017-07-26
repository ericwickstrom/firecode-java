/*
 * A Range Module is a module that tracks ranges of numbers. 
 * Range modules are used extensively when designing scalable 
 * online game maps with millions of players. 
 * Your task is to write a method - mergeIntervals that takes in an ArrayList of 
 * integer Interval s (aka ranges), and returns an ArrayList of sorted Interval s 
 * where all overlapping intervals have been merged.
 */

import java.util.*;

public class MergeIntervals {
    public static class Interval {
      int start;
      int end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }

      @Override 
      public String toString(){
          return "[" + start + ", " + end + "]";
      }
  }
    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
        
        Collections.sort(intervalsList, new Comparator<Interval>(){
            @Override
            public int compare(Interval x, Interval y){
                return x.start - y.start;
            }
        });

        ArrayList<Interval> arr = new ArrayList<>();
        Interval x = intervalsList.get(0);
        for(int i = 1; i < intervalsList.size(); i++){
            
            Interval y = intervalsList.get(i);
            if(overlap(x,y)){
                int start = x.start < y.start ? x.start : y.start;
                int end = x.end > y.end ? x.end : y.end;

                x = new Interval(start, end);    
            } else {
                arr.add(x);
                x = y;
            }
        }
        arr.add(x);    
        return arr;
    }

    private static boolean overlap(Interval x, Interval y){
        if(x.start <= y.start && y.start > x.end) return false;
        if(y.start <= x.start && x.start > y.end) return false;

        return true;
    }
    
    public static void main(String[] args){
        ArrayList<Interval> a = new ArrayList<>();
        a.add(new Interval(1,2));
        a.add(new Interval(2,3));
        a.add(new Interval(3,4));
        a.add(new Interval(4,5));
        test(a);

        a = new ArrayList<>();
        a.add(new Interval(1,3));
        a.add(new Interval(2,6));
        a.add(new Interval(8,10));
        a.add(new Interval(15,18));
        test(a);
        
        a = new ArrayList<>();
        a.add(new Interval(-1,3));
        a.add(new Interval(1,2));
        a.add(new Interval(2,4));
        test(a);

    }

    private static void test(ArrayList<Interval> a){
        print(a);
        a = mergeIntervals(a);
        print(a);
        
    }

    private static void print(ArrayList<Interval> a){
        for(Interval i : a){
            System.out.print("[" + i.start + ", " + i.end + "] ");
        }
        System.out.println("");
    }
}
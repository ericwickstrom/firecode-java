import java.util.*;

public class Second {
    public static int solution(int N){
        List<Integer> list = new ArrayList<>();
        while (N > 0) {
            int i = N % 10;
            list.add(i);
            N = N / 10;
        }

        Collections.sort(list);
        
        int total = 0;
        for(int i = 0; i < list.size(); i++){
            total += Math.pow(10, i) * list.get(i);
        }

        return total;
    }

    public static void main(String[] args){
        int N = 123456789;
        System.out.println("N: " + N);
        System.out.println(solution(N));    
    }
}
class First {
    public static void solution(int N) {
        // write your code in Java SE 8
        for(int i = 1; i <= N; i++){
            StringBuilder sb = new StringBuilder();
            
            if((i % 3 !=0) && (i % 5 != 0) && (i % 7 != 0)){
                sb.append(i);
            } else {
                if(i % 3 == 0){
                    sb.append("Fizz");
                }
            
                if(i % 5 == 0){
                    sb.append("Buzz");
                }
            
                if(i % 7 == 0){
                    sb.append("Woof");
                }
            }
            
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args){
        solution(105);
    }
}
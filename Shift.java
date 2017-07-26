class Shift {
    public static int solution(int N) {
        int largest = 0;
        int shift = 0;
        int temp = N;
        for (int i = 1; i <= 30; ++i) {
            int index = (temp & 1);

            temp = ((temp >>> 1) | (index << 29));
            System.out.println("i: " + i + " s: " + shift + " l: " + largest + " t: "+temp);            
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }

    public static void main(String[] args){
        int n = 1073742823;
        //n = 9736;
        System.out.println(solution(n));
    }
}
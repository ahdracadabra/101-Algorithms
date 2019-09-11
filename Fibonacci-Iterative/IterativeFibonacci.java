public class IterativeFibonacci{

    public static long Fibonacci(int n){
        if (n <= 1 && n >= 0) return n;
        else{
            long answer = 0;
            long minusOne = 1;
            long minusTwo = 0;
            int i = 2;
            while(i<=n){
                answer = minusOne + minusTwo;
                minusTwo = minusOne;
                minusOne = answer;
                i++;
            }
            return answer;
        }
    }

    public static void main(String[] args){
            for(int i = 0; i <= 10; i++){
                System.out.println(i + ": "  + Fibonacci(i));
            }
    }
}
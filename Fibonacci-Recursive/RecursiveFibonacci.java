import java.util.*;

public class RecursiveFibonacci{

    public static int Fibonacci(int n){
        if(
            n == 0) return 0;
        else if(n == 1) return 1;
        else{
            return (Fibonacci(n-1)) + (Fibonacci(n-2));
        }
    }

    public static void main(String[] Args){
        //prints the first 11 numbers of the fibonacci sequence
        for(int i = 0; i <= 10; i++){
            System.out.println(i + ": " + Fibonacci(i));
        }
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Prime{

    public static boolean isItPrime(int n){
        double j = n;
        double max = Math.floor(Math.sqrt(j));
        //System.out.println("Max is " + max);
        for(int i = 2; i <= max; i++){
            if((n%i)==0) return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(isItPrime(n)) System.out.println(n + " is Prime!");
        else System.out.println(n +" is not Prime");

        scanner.close();
    }
}
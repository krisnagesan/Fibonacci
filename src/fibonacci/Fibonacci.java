package fibonacci;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
    Scanner show = new Scanner(System.in);
        System.out.println("Input: ");
        int n = show.nextInt();
        long fib[] = new long[n];
        long x =0;
        
        fib[0] = 1;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Output: "); 
        for (int i = 0; i < n; i++) {
            x = x + fib[i];
        }
        System.out.print(x +  " ");
    }
}
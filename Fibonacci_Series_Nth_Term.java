//2. Write the code to find the Fibonacci series upto the nth term.

import java.util.Scanner;

public class Fibonacci_Series_Nth_Term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f0=0,f1=1,f2;

        for(int i=1;i<=n;i++)
        {
          f2=f0+f1;
          System.out.print(f0+" ");
          f0=f1;
          f1=f2;
         // System.out.print(f0+" ");
        }
    }
}

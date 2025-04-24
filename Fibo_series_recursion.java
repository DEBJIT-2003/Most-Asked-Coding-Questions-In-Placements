import java.util.*;

public class Fibo_series_recursion {
  

    // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 3;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}


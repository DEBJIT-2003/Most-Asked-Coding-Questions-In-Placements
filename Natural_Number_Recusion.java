//Write a program to find the sum of Natural Numbers using Recursion.

import java.util.Scanner;

public class Natural_Number_Recusion {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=getsum(n);
        System.out.println("sum: "+sum);
    }
    public static  int getsum(int n)
    {
        if(n==0)
        return n;
       
        return n+getsum(n-1);

    }
}

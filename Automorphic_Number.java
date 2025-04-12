import java.util.Scanner;

public class Automorphic_Number {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0,sum=0,rem=0;
        int y=n;
        int x=n*n;
        while(n>0)
        {
            d++;
            n=n/10;
        }
        sum=x%(int)Math.pow(10,d);
        if(sum==y)
        {
            System.out.println("Automorphic Number");
        }
        else
        System.out.println("Not Automorphic number");
    }
}

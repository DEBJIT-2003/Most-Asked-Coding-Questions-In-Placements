import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0,sum=0,rem=0;
        while(n>0)
        {
            rem=n%2;
            sum=sum+(int)(rem*(Math.pow(10, d++)));
            n=n/2;
        }
        System.out.println("Binary Number  number is:"+sum);
    }
}

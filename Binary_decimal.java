import java.util.Scanner;

public class Binary_decimal {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0,sum=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(int)(rem*(Math.pow(2, d++)));
            n=n/10;
        }
        System.out.println("Decimal number is:"+sum);
    }
}

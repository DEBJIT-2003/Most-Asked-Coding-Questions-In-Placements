import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0){
        System.out.print("Leap-year");
        }
        else if(n%4==0 && n%100!=0)
        {
            System.out.print("Leap-year");
        }
        else
        System.out.print(" Not Leap-year");
    }
}

//Write a code to Reverse the element of the array
import java.util.Scanner;

public class Reverse_elementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}

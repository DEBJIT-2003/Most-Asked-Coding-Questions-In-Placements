// Write a code to replace a substring in a string.
import java.util.Scanner;

public class Replace_substr {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println("Enter the String to replace:");
       String oldString=sc.nextLine();
       System.out.println("Enter the New String:");
       String newString=sc.nextLine();
       String replaceString=s.replace(oldString,newString);
       System.out.println(replaceString);


    }
}

//Write a code to Remove space from a string

import java.util.Scanner;

public class Remove_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","");
        System.out.println(s);
    }
}

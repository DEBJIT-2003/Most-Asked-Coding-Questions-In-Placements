import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            res=res+ch;
        }
        if(s.equals(res))
        {
            System.out.println("Palindrom String");
        }
        else
         System.out.println("Not Palindrom String");
    }
}

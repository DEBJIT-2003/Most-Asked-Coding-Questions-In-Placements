//29. Write a code to Remove all characters from string except alphabets
import java.util.Scanner;

public class Replace_character {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : ");
     String s = sc.nextLine();
     s=s.replaceAll("[^a-zA-Z]","");
     System.out.println(s);
   }
}

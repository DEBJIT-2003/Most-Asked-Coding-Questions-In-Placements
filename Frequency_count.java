/*29.Frequency Count:
Given the string, Find the frequency of each character in it.
The input string contains only lowercase letters. The output string should contain a letter followed by its frequency, 
in the alphabetical order (from a - z)
Input 1: babdc
Output 1: a1b2c1d1
Input 2: cbd
Output 2: b1c1d1
 */
import java.util.Scanner;

public class Frequency_count {
    public static void Frequency_string(String s)
    {
        s=s.toLowerCase();
        int c=0;
        for(int i='a';i<='z';i++)
        {
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(i==ch)
                {
                    c++;
                }
            }
            if(c!=0)
            {
            char x=(char)i;
            System.out.println(x + "" + c);
            c=0;
        }
     }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Frequency_string(s);
	}
}

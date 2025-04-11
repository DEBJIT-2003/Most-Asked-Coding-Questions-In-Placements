
import java.util.Arrays;
import java.util.Scanner;
class Anagram
{
    public boolean isAna(String s,String t)
    {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        Anagram obj=new Anagram();
        boolean r=obj.isAna(s, t);
        System.out.println(r);
    }
}
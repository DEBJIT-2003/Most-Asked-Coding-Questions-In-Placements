//Write a code to replace each element in an array by its rank in the array
import java.util.*;

public class Rank {
    public static void changeArr(int a[])
    {
        int newArray[]=Arrays.copyOfRange(a,0,a.length);
        Arrays.sort(newArray);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<newArray.length;j++)
            {
                if(newArray[j]==a[i])
                {
                    a[i]=j+1;
                    break;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        // Given array arr[]
        int[] arr = { 100, 2, 70, 12 , 90};
 
        // Function Call
        changeArr(arr);
 
        // Print the array elements
        System.out.println(Arrays.toString(arr));
    }
}

//4. Write code of  Perfect number  --->6=1,2,3 so 1+2+3=6

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++)
        {
            if((n%i)==0)
            {
                s=s+i;
            }
        }
        if(s==n){
        System.out.println("perfect Number");
    }
    else
    System.out.println("Not perfect number");
}

}

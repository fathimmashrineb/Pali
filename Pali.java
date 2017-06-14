import java.util.*;
public class Pali
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c;
        a=0;
        b=n;
        while(n>0)
        {
            c=n%10;
            a=(a*10)+c;
            n=n/10;
        }
       if(a==b)
       {
              System.out.println("palindrome number");      
       }
       else
       {
           System.out.println("not a palindrome number");      
       }
    }
}


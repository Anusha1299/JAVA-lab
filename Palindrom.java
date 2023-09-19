import java.util.*;
public class Palindrom
{
  public static void main(String[] args)
  {
    Scanner num=new Scanner(System.in);
    System.out.println("enter number");
    int n=num.nextInt();
    int x=n;
    int rem,rev=0;
    while(true)
    {
       rem=n%10;
       rev=rev*10+rem;
       n=n/10;
       if(n==0)
       break;
    }
    if(n==rev)
    System.out.println(x+" is palindrom");
    else
    System.out.println(x+" is not palindrom");
  }
}

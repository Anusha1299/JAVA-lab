import java.util.*;

public class Factors
{
  public static void main(String[] args)
  {
    Scanner num=new Scanner(System.in);
    System.out.println("enter num:");
    int n=num.nextInt();
    System.out.println("prime factors are:");
    for(int i=2;i<n;i++)
    {
      while(n%i==0)
      {
        System.out.println(i +" ");
        n=n/i;
      }
    }
    if(n>2)
    System.out.println(n);
  }
}  

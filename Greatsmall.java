import java.util.*;

public class Greatsmall
{
  public static void main(String[] args)
  { 
    Scanner num=new Scanner(System.in);
    int a[]=new int[5];
    int min,max;
    System.out.println("enter elements:");
    for(int i=0;i<5;i++)
    {
      a[i]=num.nextInt();
    }
     min=max=a[0];
    for(int i=1;i<5;i++)
    {
      if(a[i]<min)
      min=a[i];
      else if(a[i]>max)
      max=a[i];
    }
    System.out.println("greatest = "+max+" and smallest = "+min);
  }
}

import java.util.*;
import java.lang.Math;

public class Quadraticfac
{
  public static void main(String[] args)
  {
    Scanner num=new Scanner(System.in);
    double a,b,c;
    double f1,f2,real,imag;
    System.out.println("enter a,b,c values:");
    a=num.nextDouble();
    b=num.nextDouble();
    c=num.nextDouble();
    double dis=b*b-4*a*c;
    if(dis > 0)
    {
      f1=(-b+Math.sqrt(dis))/(2*a);
      f2=(-b-Math.sqrt(dis))/(2*a);
      System.out.printf("factors are: %.2f and %.2f \n",f1,f2 );
    }
    else if(dis==0)
    {
      f1=f2=-b/(2*a);
      System.out.printf("factors are: %.2f and %.2f \n",f1,f2 );
    }
    else
    {
    real=-b/(2*a);
    dis=-dis;
    imag=Math.sqrt(dis)/(2*a);
    System.out.printf("factors are : %.2f+%.2fi and %.2f-%.2fi \n",real,imag,real,imag);
    }
  }
}

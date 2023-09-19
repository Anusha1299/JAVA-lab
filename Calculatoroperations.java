
import java.util.*;
public class Calculatoroperations
{
  public static void main(String[] agrs)
  {
   int n1,n2,sum;
   char op;
   Scanner num=new Scanner(System.in);
   System.out.println("enter first num:");
   n1=num.nextInt();
   System.out.println("enter second num:");
   n2=num.nextInt();
   System.out.println("enter oprator:");
   op=num.next().charAt(0);
   switch(op)
   {
     case '+':
     sum=n1+n2;
     System.out.println("sum of "+n1 +" and "+n2+" is "+sum);
     break;
     case '-':
     sum=n1-n2;
     System.out.println("subtractin of "+n1 +" and "+n2+" is "+sum);
     break;
     case '*':
     sum=n1*n2;
     System.out.println("multiplication of "+n1 +" and "+n2+" is "+sum);
     break;
     case '/':
     sum=n1/n2;
     System.out.println("division of "+n1 +" and "+n2+" is "+sum);
     break;
   }
 
  }
}


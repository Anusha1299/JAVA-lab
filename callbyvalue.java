

public class callbyvalue
{
  public static void main(String[] args)
  {
    int a=10;
    int b=20;
    System.out.println("before swapping a=" + a + ", b=" + b);
    swap(a,b);
    System.out.println("after swapping a=" + a + ", b=" + b);
    
  }
  
  static void swap(int x,int y)
  {
    int t=x;
    x=y;
    y=t;
  }  
}



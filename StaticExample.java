

public class StaticExample
{
  static int c=0;
  void count()
  {
    c=c+20;
  }
 
  public static void main(String[] args)
  {
    StaticExample a=new StaticExample();
    a.count();
    System.out.println(c);
  }
}

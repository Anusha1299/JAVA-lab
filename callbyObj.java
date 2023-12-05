

public class callbyObj
{
  int num=10;
  
  public static void main(String[] args)
  {
    callbyObj c=new callbyObj();
    System.out.println("before change=" + c.num);
    change(c);
    System.out.println("after change=" + c.num);
  }
  
  public static void change(callbyObj a)
  {
    a.num=a.num+10;
    System.out.println("value in method=" + a.num);
  }
}
  
  

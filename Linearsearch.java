
import java.util.*;

public class Linearsearch{
  public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    
    System.out.println("enter no.of elemnts ");
    
    int n=num.nextInt();
    int[] arr=new int[n];
    
    System.out.println("enter nums");
    
    for(int i=0;i<n;i++){
      arr[i]=num.nextInt();
    }
    int f=0,i=0;
    System.out.println("enter the searching element");
    int key=num.nextInt();
    for(i=0;i<n;i++){
      if(key==arr[i]){
        f=1;
        break;
      }
    }
    if(f==1)
    {
    System.out.println("elements found at " + i);
    }
    else{
    System.out.println("element not found");
    }
  }
}
    

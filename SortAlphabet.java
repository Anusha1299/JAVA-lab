
import java.util.*;

public class SortAlphabet{
  public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    System.out.println("enter no.of names");
    int n=a.nextInt();
    String[] names=new String[n];
    
    for(int i=0;i<n;i++){
      names[i]=a.next();
    }
    
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(names[i].compareTo(names[j])>0){
          String t=names[i];
          names[i]=names[j];
          names[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(names[i] + ",");
    }
    System.out.println();
  }
}
        

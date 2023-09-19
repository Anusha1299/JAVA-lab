
import java.util.*;

public class Sort{
  public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    System.out.println("enter no.of elemnts ");
    int n=num.nextInt();
    int[] arr=new int[n];
    System.out.println("enter nums");
    for(int i=0;i<n;i++){
      arr[i]=num.nextInt();
    }
    
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("sorted list is:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }
}


import java.util.*;

public class Binarysearch{
  public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    
    System.out.println("enter no.of elemnts ");
    
    int n=num.nextInt();
    int[] arr=new int[n];
    
    System.out.println("enter nums");
    
    for(int i=0;i<n;i++){
      arr[i]=num.nextInt();
    }
    
    System.out.println("enter the searching element");
    int key=num.nextInt();
    int p=search(arr,0,arr.length,key);
    if(p!=0){
      System.out.println("element found at " + p);
    }
    else{
      System.out.println("element not found");
    }
  }
  
  static int search(int[] arr,int s,int e,int key){
    if(s<e){
      int mid=(s+e)/2;
      if(arr[mid]==key){
        return mid;
      }
      else if(key<arr[mid]){
        return search(arr,s,mid,key);
      }
      else{
      return search(arr,mid+1,e,key);
      }
    }
    else{
      return 0;
    }
  }
}

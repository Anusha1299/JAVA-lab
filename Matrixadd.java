
import java.util.*;

public class Matrixadd{
  public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    System.out.println("enter size of first matrix ");
    int r1=num.nextInt();
    int c1=num.nextInt();
    System.out.println("enter size of second matrix ");
    int r2=num.nextInt();
    int c2=num.nextInt();
    if(r1!=r2 || c1!=c2){
      System.out.println("addition not possible");
    }
    else{
      int[][] a=new int[r1][c1];
      int[][] b=new int[r2][c2];
      int[][] c=new int[r2][c2];
      System.out.println("enter elments of first matrix:");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){    
          a[i][j]=num.nextInt();
        }
      }
      System.out.println("enter elments of second matrix :");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){    
          b[i][j]=num.nextInt();
        }
      }
      System.out.println("sum of two matrix is:");  
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){  
          c[i][j]=a[i][j]+b[i][j];
          System.out.print(c[i][j] +" ");
        }
        System.out.println();
      }
    }
  }
}
          

import java.util.*;

public class Matrixmul{
  public static void main(String[] args){
    Scanner num=new Scanner(System.in);
    System.out.println("enter size of first matrix ");
    int r1=num.nextInt();
    int c1=num.nextInt();
    System.out.println("enter size of second matrix ");
    int r2=num.nextInt();
    int c2=num.nextInt();
    if(c1!=r2){
      System.out.println("matrix multiplication not possible");
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
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){    
          b[i][j]=num.nextInt();
        }
      }
      System.out.println("multiplication of two matrix is:");  
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++)
        {
           c[i][j]=0;
          for(int k=0;k<r2;k++){ 
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
          }
        }
      }
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){  
          System.out.print(c[i][j] +" ");
        }
        System.out.println();
      }
    }
  }
}      
           

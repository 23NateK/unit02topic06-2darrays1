import java.util.Arrays;

public class Main {
  
  public static int[][] copysquare(int[][] a){
    int[][] b= new int[a.length][a[0].length];
    for(int row=0;row<a.length;row++){
      for(int val=0;val<a.length;val++){
        b[row][val]=a[row][val];
      }
    }
    return b;
  }
  
  public static int[][] copyRagged(int[][] a){
    int[][] b= new int[a.length][a[0].length];
    for(int row=0;row<a.length;row++){
      for(int val=0;val<a[0].length;val++){
        b[row][val]=a[row][val];
      }
    }
    return b;
  }


  public static void main(String[] args) {
  
    
  }
}
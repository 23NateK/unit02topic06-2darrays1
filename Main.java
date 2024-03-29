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
  public static int[][] copyRectangle(int[][] a){
    int[][] b= new int[a.length][a[0].length];
    for(int row=0;row<a.length;row++){
      for(int val=0;val<a[0].length;val++){
        b[row][val]=a[row][val];
      }
    }
    return b;
  }
  public static int[][] copyRagged(int[][] a){
    int[][] b= new int[a.length][a[0].length];
    for(int row=0;row<a.length;row++){
      for(int val=0;val<a[val].length;val++){
        b[row][val]=a[row][val];
      }
    }
    return b;
  }

public static void printTranspose(double[][] a){
  for(int c=0;c<a[0].length;c++){
    for(int r=0;r<a.length;r++){
      System.out.print(a[r][c]+" ");
    }
    System.out.println();
}
}
public static double[][] withWeightedAverage(double[][] a,double[] w){
  double[][] b = new double[a.length+1][a[0].length+1];
  double sum=0;
  for(int r=0;r<a.length;r++){
    for(int c=0;c<a[0].length;c++){
      b[r][c]=a[r][c];
      sum+=a[r][c]*w[c];
    }
    b[r][3]=sum;
    sum=0;
}
for(int c=0;c<a[0].length;c++){
  for(int r=0;r<a.length;r++){
    sum+=a[r][c];
  }
  sum=sum/a.length;
  b[a.length][c]=sum;
  sum=0;
}
return b;
}

  public static void main(String[] args) {
    double[][] a = new double[][] {
      {99, 85, 98},
      {98, 57, 79},
      {92, 77, 74},
      {94, 62, 81},
      {99, 94, 92},
      {80, 76.5, 67},
      {76, 58.5, 90.5},
      {92, 66, 91},
      {77, 70.5, 66.5},
      {89, 89.5, 81}
  };
  double[] weights = { 0.25, 0.25, 0.50 };
  System.out.println(Arrays.deepToString(withWeightedAverage(a,weights)));
  }
}
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

  // FIXME: I don't think this works. Did you test it?
  public static int[][] copyRagged(int[][] a){
    int[][] b= new int[a.length][];
    for(int row=0;row<a.length;row++){
        b[row]=a[row];
    }
    return b;
  }

  // good
public static void printTranspose(double[][] a){
  for(int c=0;c<a[0].length;c++){
    for(int r=0;r<a.length;r++){
      System.out.print(a[r][c]+" ");
    }
    System.out.println();
}
}

// TODO: this is perfect, except you don't fill in the bottom right value of b (which is the average of averages)
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
for(int q=0;q<a.length;q++){
  sum+=b[q][3];
}
  sum=sum/a.length;
  b[a.length][3]=sum;
  sum=0;
return b;
}

  public static void main(String[] args) {
    int[][] a = new int[][] {
      {99, 85, 98},
      {98, 57, 79},
      {92, 77, 74},
      {94, 62, 81},
      {99, 94, 92},
      {80, 76},
      {76},
      {92, 66, 91},
      {77, 70, 66},
      {89, 89, 81}
  };
  double[] weights = { 0.25, 0.25, 0.50 };
  //System.out.println(Arrays.deepToString(withWeightedAverage(a,weights)));
  System.out.println(Arrays.deepToString(copyRagged(a)));
  }
}
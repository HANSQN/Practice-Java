public class MatrixPrint {

  public static void main(String[] args) {
    int[][] matrix = {
      { 0, 2, 3, 4, 0 },
      { 6, 0, 8, 0, 10 },
      { 11, 12, 0, 14, 15 },
      { 16, 0, 18, 0, 20 },
      { 0, 22, 23, 24, 0 },
    };

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          System.out.print(" * ");
        } else {
          System.out.printf("%2d ", matrix[i][j]);
        }
      }
      System.out.println();
    }
  }
}

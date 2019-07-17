public class MatrixCalculator {

    public static void main(String[] args) {
        
         int[][] matrixA = {{6, 8, 2}, {9, 5, 11}, {7, 2, 5}};
         int[][] matrixB = {{4, 6, 3}, {5, 8, 1}, {6, 6, 7}};
         int[][] result=addition(matrixA,matrixB);
         String line="";
         for (int i=0;i<3;i++){
             line="";
			 for (int m=0;m<3;m++){
                 line+=result[i][m]+"   ";
             }
             System.out.println(line);
         }
    }
    public static int[][] addition(int[][] m1,int[][] m2) {
         int[][] r ={{0,0,0},{0,0,0},{0,0,0}};
		 for(int i=0;i<3;i++){
            for(int m=0;m<3;m++){
                r[i][m]=m1[i][m]+m2[i][m];
            }
         }
         return r;
   }
}

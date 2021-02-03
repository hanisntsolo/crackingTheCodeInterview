package dhirendra.february03;
//Matrix Multiplication
//Very Important Question
public class MultiplyMatrices {
    public static void multiply(int[][] mat1, int[][]mat2) {
        int row = mat1.length;
        int column = mat1[0].length;
        int columnInternal = mat2.length;
        int[][] mat3 = new int[mat1.length][mat2[0].length];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                for(int k=0;k<column;k++) {
                    mat3[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int[] rows: mat3) {
            for(int col: rows) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        multiply(new int[][]{ {3, -2, 5}, {3, 0, 4} },new int[][]{ {2, 3}, {-9, 0}, {0, 4} });
    }
}

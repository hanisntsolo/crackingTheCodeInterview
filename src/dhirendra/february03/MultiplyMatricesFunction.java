package dhirendra.february03;
//very important question
public class MultiplyMatricesFunction {
    public static void multiply(int[][] mat1, int[][] mat2) {
        int[][] finalResult = multiplyMatrices(mat1,mat2);
        for(int[] row: finalResult) {
            for(int col:row) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
    private static int[][] multiplyMatrices(int[][]mat1, int[][]mat2){
        int row = mat1.length;
        int column = mat1[0].length;
        int[][] product = new int[mat1.length][mat2[0].length];
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                for(int k=0;k<column;k++) {
                    product[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        multiply(new int[][]{ {3, -2, 5}, {3, 0, 4} },new int[][]{ {2, 3}, {-9, 0}, {0, 4} });
    }

}

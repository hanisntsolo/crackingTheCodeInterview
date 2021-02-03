package dhirendra.january29;
//half Implemented
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        //loop through the matrixes elements
        int row = 0;
        int column = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                if(matrix[i][j] == 0) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                if(i == row || j == column) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println('\n');
        }
    }
//    Output should be this
//[[1,0,1],[0,0,0],[1,0,1]]
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
        setZeroes(mat);
    }
}

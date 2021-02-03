package dhirendra.february03;
//Important question
public class Transpose {
    public static void calculateTranspose(int[][] mat){
        int row = mat.length;
        int column = mat[0].length;
        int[][]transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        System.out.println("BEFORE TRANSPOSE");
        for(int[]col: mat) {
            for(int item:col) {
                System.out.print(item+" ");
            }
            System.out.println("");
        }
        System.out.println("AFTER TRANSPOSE");
        for(int[]col: transpose) {
            for(int item:col) {
                System.out.print(item+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        calculateTranspose(new int[][]{ {2, 3, 4}, {5, 6, 4} });
    }
}

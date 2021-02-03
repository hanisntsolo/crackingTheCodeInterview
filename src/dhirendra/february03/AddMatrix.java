package dhirendra.february03;

public class AddMatrix {
    public static void add(int[][] mat1, int[][]mat2) {
        int row = mat1.length;
        int column = mat1[0].length;
        int[][] mat3 = new int[row][column];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                mat3[i][j] = mat1[i][j]+mat2[i][j];
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
        add(new int[][]{ {2, 3, 4}, {5, 2, 3} },new int[][]{ {-4, 5, 3}, {5, 6, 3} });
    }
}

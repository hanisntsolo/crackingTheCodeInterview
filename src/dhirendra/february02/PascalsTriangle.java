package dhirendra.february02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PascalsTriangle {
    //using list
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        List<Integer> row = null;
        List<Integer> prev = null;

        for (int i=0;i<numRows;i++){
            row = new ArrayList<>();

            for (int j = 0;j<=i;j++){
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(prev.get(j-1) + prev.get(j));
            }
            prev = row;
            result.add(row);
        }

        return result;

    }
    //via single dimension array
    public int[] solve(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            arr[i] = (arr[i - 1] * (n - i + 1)) / i;
        }
        return arr;
    }
    //via two dimensional array
    public int[] solve1(int n) {
        int[][] dp = new int[n+1][n+1];
        for (int i = 0;i <= n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp[n];
    }


    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List list = new ArrayList();
        list = pascalsTriangle.generate(30);
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString());
        }
    }
}

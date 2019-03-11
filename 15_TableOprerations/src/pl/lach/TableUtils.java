package pl.lach;

public class TableUtils {

    public static int[][] selectTableWithGreaterSumOfElements(int[][] table1, int[][] table2) {
        if (calculateSumOfElements(table1) > calculateSumOfElements(table2)) {
            return table1;
        } else return table2;
    }

    private static int calculateSumOfElements(int[][] table) {
        int sum = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }

        }
        return sum;
    }


}

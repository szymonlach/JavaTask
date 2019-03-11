package pl.lach;

/**
 * Define the class, and in it the usable methods for operations on arrays:
 * <p>
 * 1. Takes two arrays of two-dimensional integers and returns the one in which the sum of numbers is greater,
 * 2. It accepts two arrays with subtitles and returns the one in which the total number of characters in all words is greater. For example, for arrays ["aa", "bb"], ["aaa", "bbb"] the second table will be returned, because the total number of characters is 6,
 * 3. Returns the largest number from the int [] array,
 * 4. Returns the smallest number from the int [] array,
 * 5. Adopts a two-dimensional array of int [] [] numbers and returns a one-dimensional array in which the sum of the elements is the largest (the largest row). For example, for an array [[1, 2, 3], [7, 8, 9], [3, 4, 5]], an array [7, 8, 9] should be returned.
 * We assume that nobody will pass nulls or empty arrays to methods.
 * <p>
 * In a separate class, test the operation of each method on at least one sample data.
 */
public class Main {
    public static void main(String[] args) {
        //Solution for 1.
        int[][] testNumberTable1 = new int[2][3];
        testNumberTable1[0][0] = 3;
        testNumberTable1[0][1] = 3;
        testNumberTable1[0][2] = 5;
        testNumberTable1[1][0] = 3;
        testNumberTable1[1][1] = 3;
        testNumberTable1[1][2] = 3;

        int[][] testNumberTable2 = new int[2][2];
        testNumberTable2[0][0] = 5;
        testNumberTable2[0][1] = 5;
        testNumberTable2[1][0] = 5;
        testNumberTable2[1][1] = 1;

        System.out.println(TableUtils.selectTableWithGreaterSumOfElements(testNumberTable1, testNumberTable2).equals(testNumberTable1));

        //Solution for 2.
        String[] testStringTable1 = new String[]{"aa", "bb"};
        String[] testStringTable2 = new String[]{"aaa", "bbb"};
        System.out.println(TableUtils.selectTableWithMoreCharacters(testStringTable1, testStringTable2).equals(testStringTable2));

        //Solution for 3. and 4.
        int[] testNumberTable3 = new int[]{-1, 3, 8, 19, -4, 6};
        System.out.println(TableUtils.showLargestNumberInTable(testNumberTable3));
        System.out.println(TableUtils.showSmallestNumberInTable(testNumberTable3));

        //Solution for 5.
        int[][] testNumberTable4 = new int[][]{
                new int[]{1, 2, 3},
                new int[]{7, 8, 9},
                new int[]{4, 5, 6}
        };
        int[] outputTable = TableUtils.showRowInTableWithTheLargestSumOfElements(testNumberTable4);
        System.out.println(TableUtils.drawTable(outputTable));
    }
}

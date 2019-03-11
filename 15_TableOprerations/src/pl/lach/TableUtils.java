package pl.lach;

public class TableUtils {

    public static int[][] selectTableWithGreaterSumOfElements(int[][] table1, int[][] table2) {
        if (calculateSumOfElements(table1) > calculateSumOfElements(table2)) {
            return table1;
        } else return table2;
    }

    public static String[] selectTableWithMoreCharacters(String[] table1, String[] table2) {
        if (calculateSumOfCharacters(table1) > calculateSumOfCharacters(table2)) {
            return table1;
        } else return table2;
    }

    public static int showLargestNumberInTable(int[] table) {
        int largestNumber = 0;
        for (int i = 0; i < table.length; i++) {
            largestNumber = Math.max(largestNumber, table[i]);
        }
        return largestNumber;
    }

    public static int showSmallestNumberInTable(int[] table) {
        int smallestNumber = 0;
        for (int i = 0; i < table.length; i++) {
            smallestNumber = Math.min(smallestNumber, table[i]);
        }
        return smallestNumber;
    }

    public static int[] showRowInTableWithTheLargestSumOfElements(int[][] table) {
        int numberOfRowWithLargestSumOfElements = 0;
        int currentBiggestSumOfRow = 0;
        for (int i = 0; i < table.length; i++) {
            if (currentBiggestSumOfRow < sumTableRow(table[i])) {
                currentBiggestSumOfRow = sumTableRow(table[i]);
                numberOfRowWithLargestSumOfElements = i;
            }
        }
        return table[numberOfRowWithLargestSumOfElements];
    }

    public static String drawTable(int[] table) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < table.length; i++) {
            stringBuilder.append(table[i] + ",");
        }
        return stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length()).append("]").toString();
    }

    private static int sumTableRow(int[] tableRow) {
        int sum = 0;
        for (int i = 0; i < tableRow.length; i++) {
            sum += tableRow[i];
        }
        return sum;
    }


    private static int calculateSumOfCharacters(String[] table) {
        int numberOfCharacters = 0;
        for (int i = 0; i < table.length; i++) {
            numberOfCharacters += table[i].length();
        }
        return numberOfCharacters;
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

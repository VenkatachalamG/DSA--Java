// https://leetcode.com/problems/excel-sheet-column-title/description/

package Strings.Easy;

public class ExcelSheetColumn {
    public static void main(String[] args) {
        int columnNumber = 701;
        String ans = excelSheetColumn(columnNumber);
        System.out.println(ans);
    }

    private static String excelSheetColumn(int columnNumber) {
        int remainder;
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber -= 1;
            // Get letter
            remainder = columnNumber % 26;
            // Add it to result
            ans.append((char)('A' + remainder));
            columnNumber = columnNumber / 26;
        }
        ans.reverse();
        return String.join("", ans);
    }
}

public class Solution {

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if ((!hs.add(ch + " in row " + i)) || (!hs.add(ch + " in col " + j))) {
                        return false;
                    }
                    if (!hs.add(ch + " in sub boxes " + i / 3 + " - " + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

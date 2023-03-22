import java.util.*;
public class Solution {

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
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
    public static void main(String args[])
    {
    	
    	 char[][] board = new char[][] {
             { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
             { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
             { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
             { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
             { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
             { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
             { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
             { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
             { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
         };
 
      System.out.println((isValidSudoku(board) ? "YES" : "NO"));
         
    }
    
}


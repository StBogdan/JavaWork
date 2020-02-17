package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
        // Horiz checks
        boolean[] checkArrX = new boolean[10];
        boolean[] checkArrY = new boolean[10];

        for( int i=0; i< 9; i++){
            Arrays.fill(checkArrX, false);
            Arrays.fill(checkArrY,false);

            for(int j=0; j< 9; j++){
                // Horiz
                if(board[i][j] != '.'){
                    int curElem = board[i][j] - '0';
                    if (!checkArrX[curElem])
                        checkArrX[curElem] = true;
                    else
                        return false;
                }
                // Vert
                if(board[j][i] != '.'){
                    int curElem = board[j][i] - '0';
                    if (!checkArrY[curElem])
                        checkArrY[curElem] = true;
                    else
                        return false;
                }
            }
        }
        // 3x3 checks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println("Problem36.isValidSudoku checking square " + i + " " + j );
                int offsetX = i*3;
                int offsetY = j*3;

                Arrays.fill(checkArrX, false);
                for (int sx = 0; sx < 3; sx++) {
                    for (int sy = 0; sy < 3; sy++){
                        int curX = offsetX + sx;
                        int curY = offsetY + sy;
                        if(board[curX][curY] != '.'){
                            int curElem = board[curX][curY] - '0';
                            if (!checkArrX[curElem])
                                checkArrX[curElem] = true;
                            else{
//                                System.out.println("curElem = " + curElem + " on indeces " + curX + "-" + curY );
                                return false;
                            }
                        }
                    }
                }
            }
        }

        // Got past all checks
        return true;
    }
}

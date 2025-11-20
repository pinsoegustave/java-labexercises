
public class MagicSquare {

    private int size, sum;

//    Constructor
    public MagicSquare() {
        size = 3;
        sum = 15;
    }

//    This causes the magic square to prepare to solve
    public void start() {
//        Initialize the board
        int[][] board = new int[size][size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                board[r][c] = 0;
            }
        }
//        Test code
        board[0][0] = 9;
        board[0][2] = 1;
        boolean result = canNumberBePlaced(board, 0, 1, 5);
        System.out.println(result);
        displayBoard(board);
    }
//    end start method

//    Display the board
    public void displayBoard(int[][] argBoard) {
        for (int r = 0; r < size; r++) {
            for (int c=0; c < size; c++) {
                System.out.println(argBoard[r][c]);
                System.out.println("\t");
            }
            System.out.println(" ");
        }
    }

    public boolean canNumberBePlaced(int[][] argBoard, int argRow, int argCol, int argNumber) {
//        See if the number has already been used
        for (int r = 0; r < size; r++) {
            for (int c= 0; c< size; c++) {
                if (argBoard[r][c] == argNumber) {
                    return false;
                }
            }
//            Get the current total and number of boxes filled in the row
            int currentTotal = 0;
            int currentNumValues = 0;

            for (int c = 0; c < size; c++) {
                if (argBoard[argRow][c] > 0) {
                    currentTotal += argBoard[argRow][c];
                    currentNumValues++;
                }
            }
            if (currentNumValues == size - 1){
//                The number will complete the row
//                The total with this number must = sum
                if (currentTotal + argNumber != sum) {
                    return false;
                }
            } else {
//                The number will not complete the row
//                The total with this number must be < sum
                if (currentTotal + argNumber >= sum) {
                    return false;
                }
            }


        }
//        **************************************
//            Get the current total and number of boxes filled in the column
        int currentTotal = 0;
        int currentNumValues = 0;

        for (int c = 0; c < size; c++) {
            if (argBoard[argRow][c] > 0) {
                currentTotal += argBoard[argRow][c];
                currentNumValues++;
            }
        }
        if (currentNumValues == size - 1){
//                The number will complete the column
//                The total with this number must = sum
            if (currentTotal + argNumber != sum) {
                return false;
            }
        } else {
//                The number will not complete the row
//                The total with this number must be < sum
            if (currentTotal + argNumber >= sum) {
                return false;
            }
        }
//        ****************************************

//          Get the current total and number of boxes filled in the diagonal
        currentTotal = 0;
        currentNumValues = 0;

        for (int x = 0; x < size; x++) {
            if (argBoard[x][x] > 0) {
                currentTotal += argBoard[x][x];
                currentNumValues++;
            }
        }
        if (currentNumValues == size - 1){
//                The number will complete the diagonal
//                The total with this number must = sum
            if (currentTotal + argNumber != sum) {
                return false;
            }
        } else {
//                The number will not complete the diagonal
//                The total with this number must be < sum
            if (currentTotal + argNumber >= sum) {
                return false;
            }
        }
//        *******************************
//            Get the current total and number of boxes filled in the diagonal
        currentTotal = 0;
        currentNumValues = 0;

        for (int x = 0; x < size; x++) {
            if (argBoard[x][x] > 0) {
                currentTotal += argBoard[x][x];
                currentNumValues++;
            }
        }
        if (currentNumValues == size - 1){
//                The number will complete the row
//                The total with this number must = sum
            if (currentTotal + argNumber != sum) {
                return false;
            }
        } else {
//                The number will not complete the row
//                The total with this number must be < sum
            if (currentTotal + argNumber >= sum) {
                return false;
            }
        }


//        If we get here, all the above checks were okay.
        return true;
    }
//    end of canNumberBePlaced

//    Return true if solved, false otherwise
    public boolean isSolved(int[][] argBoard) {
        for (int r = 0; r <size; r++) {
            for (int c = 0; c < size; c++) {
                if (argBoard[r][c] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
//    end is solved

    public String findFirstOpenSquare(int[][] argBoard) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (argBoard[r][c] == 0) {
                    return ""+r+c;
                }
            }
        }
//        This should never happen
        return "-1";
    }

//    This solves the board recursively
    public boolean solved(int[][] argBoard) {
//        See if the board is already solved
        if (isSolved(argBoard)) return true;

//        Get the first open square
        String result = findFirstOpenSquare(argBoard);
        int openRow = Integer.parseInt(result.substring(0, 1));
        int openCol = Integer.parseInt(result.substring(1));

//        Try each number in this box
        for (int n = 1; n <= size*size; n++) {
//            See if we can place it in this box
            if (canNumberBePlaced(argBoard, openRow, openCol, n)) {
//                Put it in the box
                argBoard[openRow][openCol] = n;

//                Try to solve this new board
                boolean solveResult = solved(argBoard);

                if (solveResult) return true;
            }
        }
//        If we get here, no solution for the current board
        return false;
    }

}

import java.util.Scanner;

public class TicTacToe{
    public static void main(String []args){
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner scnr = new Scanner(System.in);
        char player = 'X';
        while(true){
            System.out.println("Enter row # (1-3): ");
            int row = scnr.nextInt() - 1;
            System.out.println("Enter col # (1-3): ");
            int col = scnr.nextInt() - 1;     
            boolean result = makeMove(board, row, col, player);
            //Switch player
            if(result){
                if(player == 'X'){
                    player = 'O';
                }else{
                    player = 'X';
                }
                printBoard(board);       
            }
        }
    }
    public static boolean isBoardFull(char[][] board){
        boolean isSpaceFound = false;
        for(char[] row : board){
            for(char cell : row){
                if(cell == ' '){
                    isSpaceFound = true;
                }
            }
        }
        return !isSpaceFound;
    }

    public static boolean makeMove(char[][] board, int row, int col, char player){
        //Check whether the row is valid
        if(row < 0 || row > 2){
            System.out.println("Row " + row + " not valid");
            return false;
        }

        //Check whether the col is valid
        if(col < 0 || col > 2){
            System.out.println("Col " + col + " not valid");
            return false;
        }
        //Check whether the spot is occupied
        if(board[row][col] != ' '){
            System.out.println("This spot is already occupied!");
        }

        board[row][col] = player;
        return true;

    }

    public static void printBoard(char[][] board){
        System.out.println("------");
        for(char[] row : board){
            System.out.print("|");
            for(char cell : row){
                System.out.print(cell + "|");
            }
            System.out.println("\n------");
        }
    }
}
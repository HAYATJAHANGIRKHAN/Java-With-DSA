import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char player = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();
        displayBoard();
        int row, col;
        while (!isGameOver()) {
            System.out.println("Player " + player + ", enter row and column (1-3) to make a move:");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            makeMove(row, col);
            displayBoard();
            switchPlayer();
        }
        char winner = getWinner();
        if (winner != ' ') {
            System.out.println("Congratulations! Player " + winner + " has won!");
        } else {
            System.out.println("Game over. It's a draw.");
        }
    }

    private static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    private static boolean isGameOver() {
        if (getWinner() != ' ' || isBoardFull()) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static char getWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        return ' ';
    }

    private static void makeMove(int row, int col) {
        if (board[row][col] != ' ') {
            System.out.println("Invalid move. That cell is already occupied.");
            return;
        }
        board[row][col] = player;
    }

    private static char switchPlayer() {
        if (player == 'X') {
            player = 'O';
        } else player = 'X';
        return player;
    }
}


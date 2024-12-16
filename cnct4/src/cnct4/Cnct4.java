/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cnct4;

import java.util.Scanner;


public class Cnct4 {

  public static void printBoard(String[][] board) {
    for (int col = 0; col < 7; col++) {
        System.out.print((col + 1) + "\t");  
    }
    System.out.println();  

    // Print the board
    for (int row = 0; row < 6; row++) {
        for (int col = 0; col < 7; col++) {
            System.out.print(board[row][col] + "\t");  
        }
        System.out.println(); 
    }
}
  public static boolean checkWin(String[][] board, String player) {
    int rows = board.length;
    int cols = board[0].length;

  
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c <= cols - 4; c++) {
            if (board[r][c].equals(player) && 
                board[r][c + 1].equals(player) && 
                board[r][c + 2].equals(player) && 
                board[r][c + 3].equals(player)) {
                return true;
            }
        }
    }

   
    for (int c = 0; c < cols; c++) {
        for (int r = 0; r <= rows - 4; r++) {
            if (board[r][c].equals(player) && 
                board[r + 1][c].equals(player) && 
                board[r + 2][c].equals(player) && 
                board[r + 3][c].equals(player)) {
                return true;
            }
        }
    }

    
    for (int r = 3; r < rows; r++) {
        for (int c = 0; c <= cols - 4; c++) {
            if (board[r][c].equals(player) && 
                board[r - 1][c + 1].equals(player) && 
                board[r - 2][c + 2].equals(player) && 
                board[r - 3][c + 3].equals(player)) {
                return true;
            }
        }
    }

    
    for (int r = 0; r <= rows - 4; r++) {
        for (int c = 0; c <= cols - 4; c++) {
            if (board[r][c].equals(player) && 
                board[r + 1][c + 1].equals(player) && 
                board[r + 2][c + 2].equals(player) && 
                board[r + 3][c + 3].equals(player)) {
                return true;
            }
        }
    }

    return false;
}

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputScanner = new Scanner(System.in);
        String playersymbol;
        boolean playerturn = true;

        System.out.println("Welcome to Connect 4");

        String[][] board = new String[6][7];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = "/";
            }
        }
        for (int turn = 0; turn < 42; turn++) {
            System.out.println();
            printBoard(board);

            if (playerturn) {
                System.out.print("X: Enter a row 1-7: ");
                playersymbol = "X";
            } else {
                System.out.print("O: Enter a location 1-7: ");
                playersymbol = "O";
            }

            String userInput = inputScanner.nextLine();
        if (userInput.equals("1")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][0].equals("/")) {
                    board[r][0] = playersymbol;
                    break;
                }
            }
        }
        else if (userInput.equals("2")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][1].equals("/")) {
                    board[r][1] = playersymbol;
                    break;
                }
            }
        }
        else if (userInput.equals("3")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][2].equals("/")) {
                    board[r][2] = playersymbol;
                    break;
                }
            }
        } 
        else if (userInput.equals("4")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][3].equals("/")) {
                    board[r][3] = playersymbol;
                    break;
                }
            }
        }
        else if (userInput.equals("5")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][4].equals("/")) {
                    board[r][4] = playersymbol;
                    break;
                }
            }
        } 
        else if (userInput.equals("6")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][5].equals("/")) {
                    board[r][5] = playersymbol;
                    break;
                }
            }
        } 
        else if (userInput.equals("7")) {
            for (int r = 5; r >= 0; r--) {
                if (board[r][6].equals("/")) {
                    board[r][6] = playersymbol;
                    break;
                }
            }
        } 
        else {
            System.out.println("Invalid column. Please choose a number between 1 and 7.");
            
        }

        if (checkWin(board, playersymbol)) {
                printBoard(board);
                System.out.println(playersymbol + " wins");
                return;
            }

            playerturn = !playerturn;
        }

        printBoard(board);
     
    }
    
}

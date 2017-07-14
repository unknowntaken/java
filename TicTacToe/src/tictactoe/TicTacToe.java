/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class TicTacToe {

    private static char[][] board = new char[3][3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            Scanner keyboard = new Scanner(System.in);

            initBoard();
            displayBoard();
         
            boolean X = true;

            System.out.println(" Who goes?");
            int nO = (int) (Math.random() * 6) + 1;
            int nX = (int) (Math.random() * 6) + 1;
            if (nO >= nX) {
                X = false;
            }
            while (!win() && !tie()) {

                if (X) {
                    System.out.println("It's X's turn");
                    String move = keyboard.nextLine();
                    int r = Character.getNumericValue(move.charAt(0));
                    int c = Character.getNumericValue(move.charAt(1));
                    board[r][c] = 'X';
                    displayBoard();
                } else {
                    System.out.println("It's O's turn");
                    String move = keyboard.nextLine();
                    int ro = Character.getNumericValue(move.charAt(0));
                    int co = Character.getNumericValue(move.charAt(1));
                    board[ro][co] = 'O';
                    displayBoard();
                }
                X = !X;
               
                
            }

        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

   
    public static boolean win() {
        boolean win = false;
        if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && (board[0][0] != ' ')) {
            System.out.println(board[0][0] + " wins");
            win = true;
        }
        if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && (board[1][0] != ' ')) {
            System.out.println(board[1][0] + " wins");
            win = true;
        }
        if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && (board[2][0] != ' ')) {
            System.out.println(board[2][0] + " wins");
            win = true;
        }
        if ((board[2][2] == board[1][1]) && (board[1][1] == board[0][0]) && (board[2][2] != ' ')) {
            System.out.println(board[2][2] + " wins");
            win = true;
        }
        if ((board[2][0] == board[1][1]) && (board[1][1] == board[0][2]) && (board[2][0] != ' ')) {
            System.out.println(board[2][0] + " wins");
            win = true;
        }
        if ((board[2][0] == board[1][0]) && (board[1][0] == board[2][0]) && (board[2][0] != ' ')) {
            System.out.println(board[2][0] + " wins");
            win = true;
        }
        if ((board[2][1] == board[1][1]) && (board[1][1] == board[0][1]) && (board[2][1] != ' ')) {
            System.out.println(board[2][1] + " wins");
            win = true;
        }
        if ((board[2][2] == board[1][2]) && (board[1][2] == board[0][2]) && (board[0][2] != ' ')) {
            System.out.println(board[1][2] + " wins");
            win = true;
        }
        return win;
    }
    
    public static boolean tie(){
        boolean tie=false;
        if ((board[2][2] != ' ') && (board[1][1] != ' ') && (board[0][0] != ' ') && (board[0][1] != ' ') && (board[0][2] != ' ') && (board[1][0] != ' ') && (board[1][2] != ' ') && (board[2][0] != ' ') && (board[2][1] != ' ')) {
             tie=true;
            System.out.println("tie");
        }
        return tie;
    }

}

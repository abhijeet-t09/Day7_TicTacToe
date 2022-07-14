package com.bridgelabz;
import java.util.*;

public class TicTacToe {

    static char[] board;
    static final int PLAYER_1=1;
    static final int COMPUTER=2;
    static int currentPlayer;
    static char playerLetter;
    static char computerLetter;


    static Scanner sc=new Scanner(System.in);

    static char chooseLetter(){
        char letter=sc.next().charAt(0);
        return letter;
    }

    static void showBoard() {
        System.out.println(board[1] + " | "
                + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | "
                + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | "
                + board[8] + " | " + board[9]);
    }

    static int Toss(){
        int n = 0;
        Random r = new Random();
        n=1+r.nextInt(2);

        if(n==PLAYER_1) {
            System.out.println("Player 1 Goes First");
            return PLAYER_1;
        }
        else {
            System.out.println("Computer Goes First");
            return COMPUTER;
        }
    }

    static void selectPosition(int position, char choice){
        switch (position) {
            case 1:
                board[1] = choice;
                break;
            case 2:
                board[2] = choice;
                break;
            case 3:
                board[3] = choice;
                break;
            case 4:
                board[4] = choice;
                break;
            case 5:
                board[5] = choice;
                break;
            case 6:
                board[6] = choice;
                break;
            case 7:
                board[7] = choice;
                break;
            case 8:
                board[8] = choice;
                break;
            case 9:
                board[9] = choice;
                break;
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to TicTacToe Game !!");
        board=new char[10];
        char choice;

        System.out.print("Select X 0r O: ");
        playerLetter=chooseLetter();
        System.out.println("You Chose "+playerLetter+" !!");

        computerLetter=(playerLetter == 'X')?'O':'X';

        System.out.println("Computer will use "+computerLetter+" !!");

        System.out.println("\nGame Board for TicTacToe: ");
        showBoard();
        currentPlayer=Toss();
        System.out.println();

        if(currentPlayer==PLAYER_1){
            choice=playerLetter;
            System.out.println("Enter your placement position:: ");
            int position=sc.nextInt();
            selectPosition(position, choice);
            showBoard();
            System.out.println();

            choice=computerLetter;
            Random r = new Random();
            int compRoll=1+r.nextInt(9);
            selectPosition(compRoll, choice);
            showBoard();
        }
        else{
            choice=computerLetter;
            Random r = new Random();
            int compRoll=1+r.nextInt(9);
            selectPosition(compRoll, choice);
            showBoard();
            System.out.println();

            choice=playerLetter;
            System.out.println("Enter your placement position:: ");
            int position=sc.nextInt();
            selectPosition(position, choice);
            showBoard();
        }

    }
}
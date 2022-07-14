package com.bridgelabz;
import java.util.*;

public class TicTacToe {

    static char[] board;
    static char choice;
    static final int PLAYER_1=1;
    static final int COMPUTER=2;
    static int currentPlayer;
    
    static char chooseLetter(){
        Scanner sc=new Scanner(System.in);
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

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game !!");
        board=new char[10];

        System.out.print("Select X 0r O: ");
        choice=chooseLetter();
        System.out.println("You Chose "+choice+" !!");

        if(choice=='X') {
            System.out.println("Computer will use O !!");
            System.out.println();
        }
        else if(choice=='O') {
            System.out.println("Computer will use X !!");
            System.out.println();
        }
        else
            System.out.println("Invalid Option !!");

        System.out.println("\nGame Board for TicTacToe: ");
        showBoard();
        currentPlayer=Toss();

    }
}
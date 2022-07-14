package com.bridgelabz;
import java.util.*;

public class TicTacToe {

    static char[] board;
    static char choice;

    static char chooseLetter(){
        Scanner sc=new Scanner(System.in);
        char letter=sc.next().charAt(0);
        return letter;
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
    }
}
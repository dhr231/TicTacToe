package com.workshop;
import java.util.*;

public class ticTacToe {
    public static void main(String[] args){
        char[] board=createBoard();
        for(int i=0;i<10;i++) {
            board[i] = '-';
            System.out.print(board[i] + "|");
        }
        System.out.println();
        char playerSymbol=gameInput();
        char computerSymbol;
        if(playerSymbol=='X' || playerSymbol=='O'){
            System.out.println("player input received");
        }
        else{
            System.out.println("please input a valid response (X or O)");
        }
        computerSymbol=(playerSymbol=='X')? 'O' :'X';
        System.out.println(computerSymbol);

    }

    public static char[] createBoard(){
        char[] board=new char[10];
        return board;
    }

    public static char gameInput(){
        Scanner scn=new Scanner(System.in);
        char inputXO=scn.next().charAt(0);
        return inputXO;
    }

}

package com.workshop;
import java.util.*;

public class ticTacToe {
    public static void main(String[] args){
        char[] board=createBoard();
        for(int i=1;i<10;i++) {
            board[i]='-';
            System.out.print(board[i] + " " + "|");
        }
    }

    public static char[] createBoard(){
        char[] board=new char[10];
        return board;
    }

}

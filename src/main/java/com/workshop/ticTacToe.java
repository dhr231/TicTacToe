package com.workshop;
import java.util.*;

public class ticTacToe {
    public static void main(String[] args){
        char[] board=createBoard();
        displayBoard(board);
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
        Scanner scanner=new Scanner((System.in));
        int location=scanner.nextInt();
        while(!checkInputLocation(location)){
            System.out.println("This board position is not available.. Please input again");
            location=scanner.nextInt();
        }
        System.out.println("This position is available");
        board[location]=playerSymbol;




    }

    public static char[] createBoard(){
        char[] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',};
        return board;
    }

    public static char gameInput(){
        Scanner scn=new Scanner(System.in);
        char inputXO=scn.next().charAt(0);
        return inputXO;
    }
    public static void displayBoard(char[] board){
        for(int j=1;j<=3;j++){
            System.out.print(board[j]+ " " + "|");
        }
        System.out.println();
        for(int j=4;j<=6;j++){
            System.out.print(board[j]+ " " + "|");
        }
        System.out.println();
        for(int j=7;j<=9;j++){
            System.out.print(board[j]+ " " + "|");
        }

    }
    public static boolean checkInputLocation(int location){
        char[] board=new char[10];
        return board[location]==' ';




    }

}

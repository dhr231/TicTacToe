package com.workshop;
import java.util.*;

public class ticTacToe {
    public static void main(String[] args){
        int heads=0;
        int tails=1;
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
        int outcome=toss();
        if(outcome==heads){
            System.out.println("Heads, User may start the game");
        }
        else{
            System.out.println("Tails, Computer will start the game");
        }




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

    public static int toss(){
        int outcome=(int) (Math.random() *2);
        return outcome;
    }

    public int gamePlay(char[] board, char playerSymbol, char computerSymbol){
        if ((board[0] == playerSymbol && board[1] == playerSymbol && board[2] == playerSymbol) || (board[3] == playerSymbol && board[4] == playerSymbol && board[5] == playerSymbol)
                || (board[6] == playerSymbol && board[7] == playerSymbol && board[8] == playerSymbol) || (board[0] == playerSymbol && board[3] == playerSymbol && board[6] == playerSymbol)
                || (board[1] == playerSymbol && board[4] == playerSymbol && board[7] == playerSymbol) || (board[2] == playerSymbol && board[5] == playerSymbol && board[8] == playerSymbol)
                || (board[0] == playerSymbol && board[4] == playerSymbol && board[8] == playerSymbol) || (board[2] == playerSymbol && board[4] == playerSymbol && board[6] == playerSymbol)) {
            System.out.println("User has won the match");
            return 0;
        }
        if ((board[0] == computerSymbol && board[1] == computerSymbol && board[2] == computerSymbol) || (board[3] == computerSymbol && board[4] == computerSymbol && board[5] == computerSymbol)
                || (board[6] == computerSymbol && board[7] == computerSymbol && board[8] == computerSymbol) || (board[0] == computerSymbol && board[3] == computerSymbol && board[6] == computerSymbol)
                || (board[1] == computerSymbol && board[4] == computerSymbol && board[7] == computerSymbol) || (board[2] == computerSymbol && board[5] == computerSymbol && board[8] == computerSymbol)
                || (board[0] == computerSymbol && board[4] == computerSymbol && board[8] == computerSymbol) || (board[2] == computerSymbol && board[4] == computerSymbol && board[6] == computerSymbol)) {
            System.out.println("Computer has won the match");
            return 0;
        }
        int flag = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i] == ' ') {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Match Tied");
            return 0;
        }
        return 1;

    }

}

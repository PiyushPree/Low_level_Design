import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player>players;
    Board gameBoard;

    TicTacToeGame(){
        initializegame();
    }

    public void initializegame(){
        players = new LinkedList<>();

        PlayingPieceX crossX = new PlayingPieceX();
        Player player1 = new Player("jimmy", crossX);

        PlayingPieceO donutO = new PlayingPieceO();
        Player player2 = new Player("Bhanu", donutO);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

     }
     public String startGame(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            gameBoard.printBoard();
            System.out.flush();

            Player cuPlayer = players.removeFirst();
            System.out.println(cuPlayer.getName()+"'s turn, Enter a valid row n col : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            boolean moveAccepted = gameBoard.addPiece(row, col, cuPlayer.getPlayingPiece());
            if (!moveAccepted) {
                System.out.println("Invalid move! Try Again....");
                players.addFirst(cuPlayer);
                continue;
            }

            if(gameBoard.checkWinner(row, col, cuPlayer.getPlayingPiece().getPieceType())){
                gameBoard.printBoard();
                return cuPlayer.getName()+"Wins..";
            }

            if (gameBoard.isBoardFull()) {
                return "It's a Draw..";
            }
            players.addLast(cuPlayer);
        }
     }

}

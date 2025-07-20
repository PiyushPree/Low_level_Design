public class Board {
    public int size;
    public PlayingPiece[][]board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    
    public boolean addPiece(int row,int col,PlayingPiece playingPiece){
        if (row < 0 || col < 0 || row >= size || col >= size) return false;
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + board[i][j].getPieceType() + " ");
                }
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---+---+---");
            }
        }
    }

    public boolean checkWinner(int row,int col,PieceType pieceType){
        boolean win = true;
        //row

        for(int j = 0; j < size; j++){
            if(board[row][j] == null || board[row][j].getPieceType() != pieceType){
                win = false;
                break;
            }
        }
        if(win){
            return true;
        }
        //col
        win = true;
        for(int i = 0; i < size; i++){
            if(board[i][col] == null || board[i][col].getPieceType() != pieceType){
                win = false;
                break;
            }
        }
        if(win){
            return true;
        }
        //dig
        if(row == col){
            win = true;
            for(int i = 0; i < size; i++){
                if(board[i][i] == null || board[i][i].getPieceType() != pieceType){
                win = false;
                break;
            }
            }
            if(win){
            return true;
        }
        }
        

        //Anti diagonal
        if(row + col == size -1 ){
            win = true;

            for(int i = 0;i < size; i++){
                if(board[i][size-1-i] == null || board[i][size-1-i].getPieceType() != pieceType){
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }

        return false;

    }

    public boolean isBoardFull(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null) return false;
            }
        }
        return true;
    }

}

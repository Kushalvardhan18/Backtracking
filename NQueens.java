public class NQueens {
    public static Boolean isSafe(char board[][], int row,int col){
        //vertically up
        for(int i =row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i = row-1 , j = col-1; i>=0 && j>=0;i--,j--){
                if(board[i][j] =='Q'){
                    return false;

            }
        }

        // diag right up
        for(int i = row-1 , j = col+1; i>=0 && j< board.length;i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board[][], int row){

        if(row == board.length){
//            printBoard(board);
            count++;
            return true;
        }
        //Column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
               if(nQueens(board,row+1)); {
                   return true;
                }
            }
                board[row][j] = 'X'; // backtracking Step

        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("---------- chess board -----------");
        for(int i =0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print( board[i][j] +" " );
            }
            System.out.println();
        }
    }
    static int count;
    public static void main(String[] args){
        int n =40;
        char board[][] = new char[n][n];

//        intialize
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
       if (nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
       else{
            System.out.println("Solution is not possible");
        }
        System.out.println("total ways to solve n queens = " + count);
    }
}
  
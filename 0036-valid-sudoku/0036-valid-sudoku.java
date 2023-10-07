class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean validateRow = isValidRow(board);
        if(!validateRow){
            return false;
        }
        boolean validateCol = isValidCol(board);
        if(!validateCol){
            return false;
        }
        for(int i=0;i<board.length;i=i+3){
            for(int j=0;j<board[0].length;j=j+3){
                boolean validateSmallMatrix = isValidSmall(board,i,j);
                if(!validateSmallMatrix){
                    return false;
                }
            }
        }
        return true;
        
    }
    public boolean isValidSmall(char[][] board,int r,int c){
        HashMap<Character,Boolean> map = new HashMap<>();;
        for(int i=r;i<r+3;i++){   
            for(int j=c;j<c+3;j++){
                if(board[i][j]!='.' && map.containsKey(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    map.put(board[i][j],true);
                }
            }
        }
        return true;
    }
    public boolean isValidRow(char [][]board){
        HashMap<Character,Boolean> map;
        for(int i=0;i<board.length;i++){
            map = new HashMap<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.' && map.containsKey(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    map.put(board[i][j],true);
                }
            }
        }
        return true;
    }
    public boolean isValidCol(char [][]board){
        HashMap<Character,Boolean> map;
        for(int i=0;i<board.length;i++){
            map = new HashMap<>();
            for(int j=0;j<board[0].length;j++){
                if(board[j][i]!='.' && map.containsKey(board[j][i])){
                    return false;
                }else if(board[j][i]!='.'){
                    map.put(board[j][i],true);
                }
            }
        }
    return true;
    }
}
class Solution {
    public int numRookCaptures(char[][] board) {
        int i=0,j=0;
        int ansi=0;
        int ansj=0;
        for( i=0;i<board.length;i++){
            for( j=0;j<board.length;j++){
                if(board[i][j]=='R'){
                    ansi=i;
                    ansj=j;
                    break;

                }

            }
        }
        int count=0;
        int k=0,l=0;
        for( i=ansi,j=ansj,k=ansi,l=ansj;i>=0||j>=0||k<board.length||l<board.length;i--,j--,k++,l++){
            if(i>=0&&i<=ansj){
            if(board[i][ansj]=='p'){
                count++;
                i=0;

            }else if(board[i][ansj]=='B'){
                i=0;
            } }if(j>=0&&j<=ansi){
            if(board[ansi][j]=='p'){
                count++;
                j=0;
            }else if(board[ansi][j]=='B'){
                j=0;

            }}if(k>=ansi&&k<board.length){
            if(board[k][ansj]=='p'){
                count++;
                k=board.length;
                
            }else if(board[k][ansj]=='B'){
                k=board.length;
            }}
            if(l>=ansj&&l<board.length){
                if(board[ansi][l]=='p'){
                    count++;
                    l=board.length;
                }else if(board[ansi][l]=='B'){
                    l=board.length;
                }
            }
        }

return count;
        
    }
}
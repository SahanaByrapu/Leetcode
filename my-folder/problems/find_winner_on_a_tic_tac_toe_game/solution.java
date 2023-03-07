class Solution {
    public String tictactoe(int[][] moves) {
        
        int[][]row= new int[2][3], col=new int[2][3];
        int []d1=new int[2], d2=new int[2];

        for(int i=0;i<moves.length;i++)
        {
            int r=moves[i][0], c=moves[i][1];
            int idx=i%2;
            if(++row[idx][r]==3 || ++col[idx][c]==3 || r==c && ++d1[idx]==3 
               || r+c==2 && ++d2[idx]==3)
               return (idx==0)? "A":"B";

        }

        return (moves.length==9)? "Draw":"Pending";

    }
}
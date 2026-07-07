class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows=new HashSet[9];
        HashSet<Integer>[] cols=new HashSet[9];
        HashSet<Integer>[] boxs=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxs[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int box=(i/3)*3+(j/3);
                int x=board[i][j]-'0';
                if(rows[i].contains(x) || cols[j].contains(x) || boxs[box].contains(x)) return false;
                rows[i].add(x);
                cols[j].add(x);
                boxs[box].add(x);
            }
        }
        return true;
    }
}

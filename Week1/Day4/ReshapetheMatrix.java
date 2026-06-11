class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        List<Integer> elements = new ArrayList<>();
        for(int[] row : mat){
            for(int value : row){
                elements.add(value);
            }
        }
        int[][] reshaped = new int[r][c];
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshaped[i][j]= elements.get(index++);
            }
        }
        return reshaped;
        
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int sr=0,sc=0,er=arr.length-1, ec =arr[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                ans.add(arr[sr][j]);
            }
            sr++;
            //right
            if(sr>er || sc>ec) break;
            for(int i=sr;i<=er;i++){
                ans.add(arr[i][ec]);
            }
            ec--;
            //bottom
            if(sr>er || sc>ec) break;
            for(int j=ec;j>=sc;j--){
                ans.add(arr[er][j]);

            }
            er--;
            //left
            if(sr>er || sc>ec) break;
            for(int i=er;i>=sr;i--){
                ans.add(arr[i][sc]);
            }
            sc++;
        }
        return ans;
        
    }
}

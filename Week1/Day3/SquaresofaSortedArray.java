class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        int start=0;
        int end= l-1;
        for(int k = l-1;k>=0;k--){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                ans[k]=nums[start]*nums[start];
                start++;
            }else{
                ans[k]=nums[end]*nums[end];
                end--;
            }
        } 
        return ans;
        
    }
}

lass Solution {
    public double findMaxAverage(int[] nums, int k){
        int s=0;
        int l = nums.length;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int maxS = s;
        for(int i=k;i<l;i++){
            s=s+nums[i]-nums[i-k];
            maxS=Math.max(maxS,s);
        }
        return (double)maxS/k;
        
    }
}

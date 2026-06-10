class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<l;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
        
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for(int i=1; i<nums.length; i++){ 
            for(int j=i; j<nums.length; j++){
                if(nums[j] == nums[i-1])
                    return true;
            }
        }return false;
    }
}
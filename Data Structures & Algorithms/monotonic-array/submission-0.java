class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIn = false;
        if(nums[0] < nums[nums.length-1]){
            isIn = true;
        }
        for(int i = 0; i < nums.length-1; i++) {
            if(isIn) {
            if(!(nums[i] <= nums[i+1])){
                    return false;
                }
            }else{
                if(!(nums[i] >= nums[i+1])){
                    return false;
                }
            }
        }
        return true;
    }
}
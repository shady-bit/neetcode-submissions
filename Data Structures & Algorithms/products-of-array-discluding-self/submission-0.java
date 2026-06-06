class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fromStart = new int[nums.length];
        int[] fromEnd = new int[nums.length];
        int[] res = new int[nums.length];
        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            temp = nums[i] * temp;
            fromStart[i] = temp;
        }
        temp = 1;
        for(int j = nums.length - 1 ; j >= 0; j--){
            temp = nums[j] * temp;
            fromEnd[j] = temp;
        }

        for(int k = 0; k < nums.length; k++) {
            int left  = (k == 0) ? 1 : fromStart[k-1];
            int right = (k == nums.length - 1) ? 1 : fromEnd[k+1];
            res[k] = left * right;
        }
        return res;
    }
}  

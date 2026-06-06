class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int temp = 0;
        for(int i =0; i < temperatures.length; i++) {
            int count = 0;
            for (int j = i + 1; j < temperatures.length; j++){
                ++count;
                if(temperatures[i] < temperatures[j]){
                    result[i] = count;
                    break;
                }
            }
        }
        return result;
    }
}

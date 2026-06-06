class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                stc.push(arr[i]);
            }else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']'){
                if(stc.isEmpty()) return false;
                char temp = stc.pop();
                if(arr[i] == map.get(temp)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stc.isEmpty();
    }
}

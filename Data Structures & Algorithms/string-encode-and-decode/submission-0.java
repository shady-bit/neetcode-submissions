class Solution {

    public String encode(List<String> strs) {
        StringBuilder finalstr = new StringBuilder();
        for(int i = 0 ;i < strs.size(); i++){
            int strLength = strs.get(i).length();
            finalstr.append(strLength);
            finalstr.append("#");
            finalstr.append(strs.get(i));
        }
        return finalstr.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int size = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            res.add(str.substring(i, i + size));
            i += size;
        }
        return res;
    }
}

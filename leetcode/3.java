class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet();
        
        int count = 0;
        int max = 0;
        for(int j = 0; j < s.length(); j++){
            for(int i = j; i < s.length(); i++){
                if(set.add(s.charAt(i))){
                    count++;
                }else{
                    set.clear();

                    break;
                }
            }
            if(max < count) max = count;
            count = 0;
        }
        
        return max;
    }
}

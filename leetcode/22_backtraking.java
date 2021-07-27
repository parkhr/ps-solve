class Solution {
    public List<String> generateParenthesis(int n){

        List<String> list = new ArrayList<>();
        recu(0, n*2, new StringBuffer(), list);
        return list;
    }

    public void recu(int start, int n, StringBuffer str, List<String> list){
        if(start == n){
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') stack.push('(');
                else {
                    if(stack.isEmpty()) return ;
                    stack.pop();
                }
            }

            if(stack.size() == 0) list.add(str.toString());
            return ;
        }

        recu(start+1, n, str.append("("), list);
        str.deleteCharAt(str.length() -1);
        recu(start+1, n, str.append(")"), list);
        str.deleteCharAt(str.length() -1);
    }

    
    // =====================================================================================
    // 백트래킹!! 가지치기 한다. 
    public void recu(int start, int n, int open, int close, StringBuffer str, List<String> list){
        if(start == n){
            list.add(str.toString());
            return ;
        }

        if(open < n/2){
            recu(start+1, n, open+1, close, str.append("("), list);
            str.deleteCharAt(str.length() -1);   
        }
        
        if(close < open){
            recu(start+1, n, open, close+1, str.append(")"), list);
            str.deleteCharAt(str.length() -1);
        }
    }
}

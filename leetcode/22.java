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
}

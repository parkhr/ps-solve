// 재귀 감을 조금씩 익혀가는듯
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int a = 1;
        return search(root, a);
    }
    
    public int search(TreeNode root, int a){
        if(root == null) return a-1;
        
        return Math.max(search(root.left, a+1), search(root.right, a+1));
    }
}

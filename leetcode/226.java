class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        left(root.left);
        right(root.right);
        
        return root;
    }
    
    public void left(TreeNode root){
        if(root == null) return ;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        left(root.left);
        right(root.right);
    }
    
    public void right(TreeNode root){
        if(root == null) return ;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        left(root.left);
        right(root.right);
    }
}

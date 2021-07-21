class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode result = new TreeNode();
        if(root1 == null && root2 == null) return null;
        
        if(root1 != null && root2 == null) result.val = root1.val;
        if(root1 == null && root2 != null) result.val = root2.val;
        if(root1 != null && root2 != null) result.val = root1.val + root2.val;
        
        if(root1 != null && root2 == null){
            result.left = mergeTrees(root1.left, null);
            result.right = mergeTrees(root1.right, null);
        }
        if(root1 == null && root2 != null){
            result.left = mergeTrees(null, root2.left);
            result.right = mergeTrees(null, root2.right);
        }
        if(root1 != null && root2 != null){
            result.left = mergeTrees(root1.left, root2.left);
            result.right = mergeTrees(root1.right, root2.right);
        }
        
        return result;
    }

}

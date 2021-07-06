// 이건 양방향으로 트리 탐색 할 수 있다는걸 보여준듯?
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return search(root, root);
    }
    
    public boolean search(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        
        if((r1.val == r2.val)){
            if(search(r1.left, r2.right) && search(r1.right, r2.left)) return true;
        }
        
        return false;
    }
}

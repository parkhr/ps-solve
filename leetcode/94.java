// tree 전위 중위 후위 탐색 구분하기

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        List<Integer> list = new ArrayList();
        inorder(root, list);
        
        return list;
    }
    
    public void inorder(TreeNode root, List list){
        if(root.left != null) inorder(root.left, list);
        list.add(root.val);
        if(root.right != null) inorder(root.right, list);
    }
}

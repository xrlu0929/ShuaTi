
/**
 * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
 * }
 */
public class kthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNodes(root.left) + 1;
        if (leftCount == k) {
            return root.val;
        } else if (leftCount > k) {
            return kthSmallest(root.left, k);
        } else {
            return kthSmallest(root.right, k - leftCount);
        }
    }

    private int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int x) {
         val = x;
     }
 }
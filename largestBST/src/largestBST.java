public class largestBST {
    class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int key) {
            this.key = key;
        }
    }
    public int largestBSTSubTree(TreeNode root) {
        int[] largest = new int[1];

        findLargest(root, largest);
        return largest[0];
    }

    // time complexity = O(n)
    private int[] findLargest(TreeNode root, int[] largest) {
        int[] result = new int[3];
        if(root == null) {
            return result;
        }

        int[] leftResult = findLargest(root.left, largest);
        int[] rightResult = findLargest(root.right, largest);
        if(leftResult[0] == -1 || rightResult[0] == -1
            || (root.left != null && root.key < leftResult[2])
            || (root.right != null && root.key > rightResult[1]) ) {
            result[0] = -1;
        } else {
            result[0] = 1 + leftResult[0] + rightResult[0];
            result[1] = root.left == null ? root.key : leftResult[1];
            result[2] = root.right == null ? root.key : rightResult[2];
            largest[0] = Math.max(largest[0], 1 + leftResult[0] + rightResult[0]);
        }

        return result;
    }

}

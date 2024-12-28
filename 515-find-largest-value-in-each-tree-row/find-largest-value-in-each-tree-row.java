/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    public void dfs(TreeNode node, int depth, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (depth == result.size()) {
            result.add(node.val);
        }
        else {
            result.set(depth, Math.max(result.get(depth), node.val));
        }

        dfs(node.left, depth + 1, result);
        dfs(node.right, depth + 1, result);
    }
}
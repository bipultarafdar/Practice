
public class HouseRobber3 {

    public int rob(TreeNode root) {
        if(root == null) return 0;
        int cost = root.val;
        if(root.right != null) {
            cost += rob(root.right.left) + rob(root.right.right);
        }
        if(root.left != null) {
            cost += rob(root.left.left) + rob(root.left.right);
        }
        return Math.max(cost,
                       rob(root.left) + rob(root.right));
    }
}

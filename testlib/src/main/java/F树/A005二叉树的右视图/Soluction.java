package F树.A005二叉树的右视图;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Z2019.A003.TreeNode;

public class Soluction {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode.setLeftNode(treeNode1);
        treeNode.setRightNode(treeNode2);
        treeNode1.setLeftNode(treeNode3);
        treeNode1.setRightNode(treeNode4);
        treeNode2.setLeftNode(treeNode5);
        treeNode2.setRightNode(treeNode6);
        getTreeNode(treeNode);
    }
    //leetcode:199
    static void getTreeNode(TreeNode treeNode) {
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i == size - 1) {
                    list.add(poll);
                }
                if (poll.leftNode != null) {
                    queue.offer(poll.leftNode);
                }
                if (poll.rightNode != null) {
                    queue.offer(poll.rightNode);
                }
            }
        }
        for (TreeNode treeNode1 : list) {
            System.out.println(treeNode1.val);
        }
    }
}

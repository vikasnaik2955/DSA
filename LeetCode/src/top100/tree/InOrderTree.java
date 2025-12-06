package top100.tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTree {

    static class TreeNode{
        int val;
        TreeNode left, right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public void helper(List<Integer> l, TreeNode root){

        if(root == null){
            return;
        }

        helper(l, root.left);
        l.add(root.val);
        helper(l, root.right);
    }
    public List<Integer> inOrderTravals(TreeNode root){

        List<Integer> list = new ArrayList<>();


        helper(list, root);

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = null;

        root.right = new TreeNode(2);

        root.right.left = new TreeNode(3);

        InOrderTree it = new InOrderTree();

        List<Integer> list = it.inOrderTravals(root);

        System.out.println("Inorder Travels ");
        for (Integer i : list){

            System.out.print(i+" -> ");

        }

        System.out.print("null");
    }
}

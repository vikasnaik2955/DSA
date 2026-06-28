package top100.tree;

public class SymmentricTree {

    static class Node{

        Node left, right;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node left, Node right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public Node() {
        }

        public boolean isSymmentric(Node root){

            return root == null || isSymmentricHelp(root.left, root.right);
        }

        public boolean isSymmentricHelp(Node left, Node right){
            if (left == null || right == null){
                return left == right;
            }

            if (left.val != right.val){
                return false;
            }

            return isSymmentricHelp(left.left, right.right) && isSymmentricHelp(left.right, right.left);
        }
    }
    public static void main(String[] args) {

        SymmentricTree.Node st = new SymmentricTree.Node();

        Node root1 = new Node(10);

        root1.right = new Node(11);
        root1.left = new Node(11);

        Node root2 = new Node(20);

        root2.right = new Node(21);
        root2.left = new Node(22);

        System.out.println("First Node Output -> "+st.isSymmentric(root1));

        System.out.println("Second Node Output -> "+st.isSymmentric(root2));

    }
}

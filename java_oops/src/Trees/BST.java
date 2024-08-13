package Trees;

 class BST {
    public BST() {
    }

    public  class Node {
         int value;
        Node left;
         Node right;
        int height;

        public Node(int value) {
            this.value = value;

        }
    }

     Node root;
     public int height() {
         return height(root);
     }
        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void preorder(){
            preorder(root);
    }
    public void preorder(Node node){
            if(node==null){
                return;
            }
        System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
    }
     public void postorder(){
         postorder(root);
     }
     public void postorder(Node node){
         if(node==null){
             return;
         }

         postorder(node.left);
         postorder(node.right);
         System.out.print(node.value + " ");
     }
     public void inorder(){
         inorder(root);
     }
     public void inorder(Node node){
         if(node==null){
             return;
         }
         inorder(node.left);
         System.out.print(node.value + " ");
         inorder(node.right);
     }
}



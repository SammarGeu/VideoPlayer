package Trees;
public class Main {
    public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//        BT tree=new BT();
//        tree.populate(scn);
//        tree.display();

        BST tree= new BST();
//        tree.insert(5);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(4);
//        tree.insert(10);
//        tree.insert(2);
//        tree.insert(88);
//        tree.insert(90);

        int []arr={1,2,3,4,5,6,7,8,9,10};
        tree.populate(arr);
        System.out.println(tree.height());

        System.out.println(tree.balanced());

        tree.display();


        System.out.println("postOrder traversal :");
        tree.postorder();
        System.out.println();
        System.out.println("inOrder Traversal :");
        tree.inorder();
        System.out.println();
        System.out.println("preorder Traversal :");
        tree.preorder();

    }
}

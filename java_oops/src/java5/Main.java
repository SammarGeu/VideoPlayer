package java5;

import java.util.*;

 public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        BT tree=new BT();
        tree.populate(scn);
        tree.display();
    }
     static class BT {
        BT() {
        }

        private static class Node {
            int value;
            Node left;
            Node right;

            Node(int value) {
                this.value = value;
            }
        }

        private Node root;

        public void populate(Scanner scanner) {

            System.out.println("Enter the root node :");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner, root);
        }

        private void populate(Scanner scanner, Node node) {
            System.out.println("Do you wont to enter the left child of :" + node.value);
            boolean left = scanner.nextBoolean();
            scanner.nextLine();
            if (left) {
                int leftValue = scanner.nextInt();
                node.left = new Node(leftValue);
                populate(scanner, node.left);
            }
            scanner.nextLine();
            System.out.println("Do you wont to enter the right  child of :" + node.value);
            boolean right = scanner.nextBoolean();
            scanner.nextLine();
            if (right) {
                int rightValue = scanner.nextInt();
                node.right = new Node(rightValue);
                populate(scanner, node.right);
            }

        }

        public void display() {
            display(this.root, " ");
        }

        private void display(Node node, String indent) {
            if (node == null) {
                return;
            }
            System.out.println(indent + node.value);
            display(node.left, indent + '\t');
            display(node.right, indent + '\t');


        }
    }
}
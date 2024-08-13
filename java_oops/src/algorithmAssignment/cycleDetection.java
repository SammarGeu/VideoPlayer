//Ques 24- Floyd's cycle detection Algorithm
package algorithmAssignment;
public class cycleDetection {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);


        //intentionally creating a cycle
        linkedList.Head.next.next.next.next.next.next = linkedList.Head;
        boolean Cycle = cycleDetect(list);
        System.out.println("Does the linked list have a cycle? " + Cycle);
    }
    static boolean cycleDetect(linkedList list) {
        linkedList.Node slow = linkedList.Head;
        linkedList.Node fast = linkedList.Head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
      }
    }

     class linkedList {
       static  Node Head;

        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void insert(int data) {
            Node newNode = new Node(data);
            newNode.next = Head;
            Head = newNode;
        }


    }

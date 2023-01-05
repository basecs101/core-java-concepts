
public class LinkedListExample {

    private static class Node {
        int data;
        Node next;

        public Node(int data, Node address) {
            this.data = data;
            this.next = address;
        }
    }

    //add a node at the end of linkedList
    void addNode(Node head, Node node){

        if (head == null){
            head = node;
        } else {
            Node ptr = head;
            while (ptr.next !=null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    void printList(Node head){
        if (head !=null){
            Node temp = head;
            System.out.print("Head["+ head.next.hashCode()+"]--> ");
            while (temp.next !=null){
                System.out.print("["+temp.data + " , "+temp.next.hashCode()+"] --> ");
                temp = temp.next;
            }
            System.out.print("["+temp.data + " , "+temp.next+"]");
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {

        LinkedListExample.Node head = null;

        LinkedListExample.Node first =  new LinkedListExample.Node(10,null);
        LinkedListExample.Node second = new LinkedListExample.Node(20,null);
        LinkedListExample.Node third = new LinkedListExample.Node(30,null);

        head = first;
        first.next = second;
        second.next = third;




        LinkedListExample linkedList = new LinkedListExample();

        linkedList.printList(head);

        LinkedListExample.Node fourth = new LinkedListExample.Node(40,null);
        linkedList.addNode(head, fourth);

        linkedList.printList(head);
    }


}

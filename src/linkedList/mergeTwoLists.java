package linkedList;

public class mergeTwoLists {
    MyLinkedList link1=new MyLinkedList();
    MyLinkedList link2=new MyLinkedList();

    //link1.addNode(1);


    public static void main(String[] args) {
        //while (head.next)
    }
    public static Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        Node head = null;
        if (l1.data <= l2.data) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
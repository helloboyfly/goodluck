package linkedList;

public class Node {
    int data;
    Node next=null;
    Node(int data) {
        this.data=data;
    }
}
class  nodetest{
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);

        Node head2=new Node(3);
        head2.next=new Node(4);

        Node head=new Node(0);
        Node result=head;
        //head.data=9;
        System.out.println(head.data);
        //ListNode result=null;
        while(head1!=null&&head2!=null){
            //
            if(head1.data<head2.data){

                head.data=9;
                        //head1.data;
                head1=head1.next;
                head=head.next;
            }else{

                head.data=head2.data;
                head2=head2.next;
                head=head.next;
            }
        }
        if(head1==null){
            head.data=head2.data;
            head.next=head2.next;
        }
        if(head2==null){
            head.data=head1.data;
            head.next=head1.next;
        }
        while(head!=null) {
            System.out.print(head.data);
            head = head.next;
        }
//        Node h=head;
//        System.out.println(h.data);
//        head=head.next;
//        System.out.println(h.data);
    }
}
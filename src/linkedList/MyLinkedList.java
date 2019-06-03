package linkedList;

public class MyLinkedList {
    Node head=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean deleteNode(int index){
        if(index<1||index>length())
            return false;
        else if(index==1){
            head=head.next;
            return true;
        }
        Node pre=head;
        while (--index!=1){
            pre=pre.next;
        }
        Node temp=pre.next;
        pre.next=temp.next;
        return true;
    }
    public int length(){
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public Node linkSort(){
        Node curNode = head;
        while(curNode != null){
            Node nextNode = curNode.next;
            while(nextNode != null){
                if(curNode.data > nextNode.data){
                    int temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }
    public void printLink(){
        Node curNode=head;
        while (curNode!=null){
            System.out.print(curNode.data+" ");
            curNode=curNode.next;
        }
        System.out.println();
    }
    /*返回倒数第K个结点*/
    public Node findReverseNode(int k){
        if(k<1)
            return null;
        Node first=head;
        Node second=head;
        for(int i=1;i<k;i++){
            first=first.next;
            if(first==null)
                return null;
        }
        while (first.next!=null){
            first=first.next;
            second=second.next;
        }
        System.out.println(second.data);
        return second;
    }
    /*反转链表*/
    public void reverseLink(){
        Node pre=head;
        Node current=pre.next;
        while (current!=null){
            Node next=current.next;
            current.next=pre;
            if(pre==head)
                head.next=null;
            pre=current;
            current=next;
        }
        head=pre;
    }
    /*链表中点*/
    public Node findMiddleNode(){
        Node slowPtr=head;
        Node quickPtr=head;
        while (quickPtr.next!=null){
            slowPtr=slowPtr.next;
            quickPtr=quickPtr.next;

            quickPtr=quickPtr.next;
            if(quickPtr==null)
                break;
        }
        System.out.println(slowPtr.data);
        return slowPtr;
    }
}

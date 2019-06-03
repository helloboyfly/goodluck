package linkedList;

public class test {
    public static void main(String[] args){
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(66);
        myLinkedList.addNode(9);
        myLinkedList.addNode(4);
        //myLinkedList.addNode(5);
        myLinkedList.printLink();
        System.out.println(myLinkedList.length());
        /*myLinkedList.deleteNode(5);
        myLinkedList.printLink();
        System.out.println(myLinkedList.length());*/
        myLinkedList.linkSort();
        myLinkedList.printLink();
        myLinkedList.findReverseNode(7);
        myLinkedList.reverseLink();
        myLinkedList.printLink();
        myLinkedList.findMiddleNode();
    }
}

package dfdsfds;

import java.util.ArrayList;

public class nextBig {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList();
        ListNode tempNode=head;
        ListNode temp=head;
        boolean find=false;
        while (temp.next!=null){
            while (tempNode!=null){
                if(tempNode.val>temp.val){
                    list.add(tempNode.val);
                    find=true;
                    break;
                }
                tempNode=tempNode.next;
            }
            if(!find)
                list.add(0);
            temp=temp.next;
            tempNode=temp;
        }

        list.add(0);
        return new int[2];
    }
}

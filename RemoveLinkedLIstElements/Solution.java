package Java_Advanced.LeetCode.RemoveLinkedLIstElements;

import Java_Advanced.DataStructurenAlgorithms.LinkedList.Node;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){return null;}
        ListNode cnode=head;
        while(cnode!=null){
            ListNode node;

            if(cnode.next.val==val){
                node=cnode.next;
                cnode.next=node.next;
                node.next=null;
                continue;

            }

            cnode=cnode.next;
        }
        if(head.val==val){
            ListNode n=null;
            n=head.next;
            head.next=null;
            head=n;
        }
        return head;
        
    }

    
}

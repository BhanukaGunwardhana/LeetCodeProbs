package MergeTwoSortedLists;

public class Solution {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode node=list1;
        ListNode node2=null;
        ListNode pnode1=null;
        while(node!=null){

            node2=list2;
            ListNode pnode=null;
            while(node2!=null){
                ListNode holdlist1=null;
                ListNode holdlist2=null;
                ListNode hold=null;
                if(node.val<=node2.val && pnode==null && pnode1==null){
                    pnode=node2;
                    pnode1=node;
                    pnode1.next=pnode;
                    pnode=node.next;
                    node=node.next.next;
                    break;

                }
                
                if(node.val<=node2.val && pnode!=null){
                    pnode1.next=pnode;
                    pnode.next=node;
                    node.next=holdlist1;
                    node2.next=holdlist2;
                //list2.next=null;
                    node.next=node2;
                    node2.next=holdlist1;
                    list2=holdlist2;
                    node=node.next.next;
                    break;
   
                }
                if(node.val<=node2.val && pnode==null ){
                    node.next=holdlist1;
                    node.next=node2;
                    node2.next=holdlist1;
                    list2=null;
                    node=node.next.next;
                    break;

                }
                
                if(node2.next!=null){

                }

                pnode=node2;
                node2=node.next;
            }
            
            if(node2==null && list2!=null){

                return list1;
            }
            pnode1=node;
            node=node.next;
        }
        if(node==null && list2!=null){
            pnode1.next=list2;
        }
        return list1;
    }
    
}

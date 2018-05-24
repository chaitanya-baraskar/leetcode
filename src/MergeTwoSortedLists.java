import AddingTwoLinkedNumbers.AddingTwoLinkedListNumbers;
import AddingTwoLinkedNumbers.ListNode;

import java.util.List;

public class MergeTwoSortedLists {

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sortedList = new ListNode(0);
        ListNode prev = sortedList;

        if(l1 == null && l2 == null){
            return null;
        }

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        while(l1 != null && l2 != null){

            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else if(l1.val >= l2.val){
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l2 == null){
            prev.next = l1;
        }

        if(l1 == null){
            prev.next = l2;
        }


        /*ListNode ref3 = sortedList.next;
        System.out.println("Output --- ");
        while (ref3 != null){
            System.out.println(ref3.val);
            ref3 = ref3.next;
        }*/

        return sortedList.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        l4.next = l5;
        l5.next = l6;
        l6.next = null;


        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        mergeTwoSortedLists.addTwoNumbers(l1,l4);


    }


}

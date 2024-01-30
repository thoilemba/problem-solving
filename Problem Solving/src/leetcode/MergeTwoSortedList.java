package leetcode;


class ListNode {
	
    int val;
    
    ListNode next;

    ListNode(int val) {
    	this.val = val;
    }
}

public class MergeTwoSortedList {
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Compare values of nodes from both lists and merge
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If one of the lists is not empty, append the remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the head of the merged list (skip the dummy node)
        return dummy.next;
    }
    
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // Create a pointer to the head of the merged list
        ListNode head = null;
        // Create a pointer to the tail of the merged list
        ListNode tail = null;

        // Compare values of nodes from both lists and merge
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    head = l1;
                    tail = l1;
                } else {
                    tail.next = l1;
                    tail = l1;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    tail = l2;
                } else {
                    tail.next = l2;
                    tail = l2;
                }
                l2 = l2.next;
            }
        }

        // Append the remaining nodes
        if (l1 != null) {
            if (head == null) {
                head = l1;
            } else {
                tail.next = l1;
            }
        } else {
            if (head == null) {
                head = l2;
            } else {
                tail.next = l2;
            }
        }

        // Return the head of the merged list
        return head;
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

//        ListNode mergedList = mergeTwoLists(list1, list2);
        ListNode mergedList2 = mergeTwoLists2(list1, list2);

         
//        while (list1 != null) {
//            System.out.print(list1.val + " ");
//            list1 = list1.next;
//        }
//        
//        System.out.println();
//        while (list2 != null) {
//            System.out.print(list2.val + " ");
//            list2 = list2.next;
//        }
        
        System.out.println("Output:");
        while (mergedList2 != null) {
            System.out.print(mergedList2.val + " ");
            mergedList2 = mergedList2.next;
        }// Output: 1 1 2 3 4 4
        
    }
    

}

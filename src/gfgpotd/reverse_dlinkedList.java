/*
 * Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75
Your Task:
Your task is to complete the given function reverseDLL(), which takes head reference as argument and this function should reverse the elements such that the tail becomes the new head and all pointers are pointing in the right order. You need to return the new head of the reversed list. The printing and verification is done by the driver code.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
 */

package gfgpotd;

import org.w3c.dom.Node;

public class reverse_dlinkedList {
    
    public static Node reverseDLL(Node  head)
    {
        //Your code here
        Node prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr.prev = next;
            
            curr = next;
        }
        head = prev;
        
        return head;
        
    }
}

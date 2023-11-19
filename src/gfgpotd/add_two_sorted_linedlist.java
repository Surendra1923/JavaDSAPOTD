
/*
 * Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Example 1:

Input:
LinkedList1 = 1->2->3->4->6
LinkedList2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given two
linked list, 2, 4 and 6 are the elements
in the intersection.
Example 2:

Input:
LinkedList1 = 10->20->40->50
LinkedList2 = 15->40
Output: 40
Your Task:
You don't have to take any input of print anything. Your task is to complete the function findIntersection(), which will take head of both of the linked lists as input and should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n, m are the size of the respective linked lists.

Constraints:
1 <= size of linked lists <= 5000
1 <= Data in linked list nodes <= 104
 */

package gfgpotd;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class add_two_sorted_linedlist {

    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        ArrayList<Integer> arr=new ArrayList<>();
        Node a=head1,b=head2;
        
        while(a!=null && b!=null)
        {
            if(a.data==b.data)
            {
                arr.add(a.data);
                a=a.next;
                b=b.next;
                continue;
            }
            else if(a.data<b.data){
                a=a.next;
            }
            else{
                b=b.next;
            }
        }
        Node dum=new Node(0);
        Node res=dum;
        for(int x:arr){
            Node node=new Node(x);
            res.next=node;
            res= node;
        }
        return dum.next;
    
}

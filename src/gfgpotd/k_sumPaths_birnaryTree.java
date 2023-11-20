/*
 * Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K.
A path may start from any node and end at any node in the downward direction.
Since the answer may be very large, compute it modulo 109+7.

Example 1:

Input:      
Tree = 
          1                               
        /   \                          
       2     3
K = 3
Output: 
2
Explanation:
Path 1 : 1 + 2 = 3
Path 2 : only leaf node 3
Example 2:

Input: 
Tree = 
           1
        /     \
      3        -1
    /   \     /   \
   2     1   4     5                        
        /   / \     \                    
       1   1   2     6    
K = 5                    
Output: 
8
Explanation:
The following paths sum to K.  
3 2 
3 1 1 
1 3 1 
4 1 
1 -1 4 1 
-1 4 2 
5 
1 -1 5 
Your Task:  
You don't need to read input or print anything. Complete the function sumK() which takes root node and integer K as input parameters and returns the number of paths that have sum K. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(Height of Tree)

Constraints:
1 ≤ N ≤ 2*104
-105 ≤ Node Value ≤ 105
-109 ≤ K ≤ 109
 */

package gfgpotd;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class k_sumPaths_birnaryTree {

     int count = 0;
    void helper(Node root, int k, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        int size = path.size();
        int sum = 0;
        for(int i = size-1; i >= 0; i--){
            sum += path.get(i);
            if(sum == k){
                count++;
            }
        }
        helper(root.left, k, path);
        helper(root.right, k, path);
        path.remove(path.size()-1);
        
    }
    
    
    public int sumK(Node root,int k)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,k,ans);
        return count;
    }
    
}

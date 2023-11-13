/*
 * Given two strings X and Y of lengths m and n respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.
Note: X and Y can have both uppercase and lowercase letters.

Example 1

Input:
X = abcd, Y = xycd
Output: 6
Explanation: Shortest Common Supersequence
would be abxycd which is of length 6 and
has both the strings as its subsequences.
Example 2

Input:
X = efgh, Y = jghi
Output: 6
Explanation: Shortest Common Supersequence
would be ejfghi which is of length 6 and
has both the strings as its subsequences.
Your Task:
You don't have to take any input or print anything. Your task is to complete shortestCommonSupersequence() function that takes X, Y, m, and n as arguments and returns the length of the required string.

Expected Time Complexity: O(Length(X) * Length(Y)).
Expected Auxiliary Space: O(Length(X) * Length(Y)).

Constraints:
1<= |X|, |Y| <= 100

 
 */

package gfgpotd;

public class shortest_common_subsequence_string {


    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        return m+n-lcs(m,n,X,Y);
        
    }
    public static int lcs(int m,int n, String s1,String s2 ){
        
        int dp[][]= new int[m+1][n+1];
        
        for(int i=0;i<=m; i++)
        {
            
            for( int j=0;j<=n; j++)
            {
                
                if(i==0 || j==0) dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        return dp[m][n];
    }
    
}

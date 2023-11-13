/*
 * Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Example 1:

Input:
str1 = aab
str2 = xxy
Output: 
1
Explanation: 
There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
Example 2:

Input:
str1 = aab
str2 = xyz
Output: 
0
Explanation: 
There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.
 */
// this is to practice the git branching cmds
package gfgpotd;
import java.util.*;

public class isomorphic_strings {

    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;
        
        HashMap<Character,Character> m=new HashMap<>();
        
        if(str1.length()!=str2.length()) return false;
        
        HashMap<Character,Character> m=new HashMap<>();
        HashMap<Character,Integer> vis=new HashMap<>();
        
        for(int i=0;i<str1.length();i++)
        {
            
            char c1=str1.charAt(i), c2=str2.charAt(i);
            
            if(!m.containsKey(c1)){
                
                
                if(!vis.containsKey(c2)){
                    m.put(c1,c2);
                    vis.put(c2,1);
                }
                else if(vis.get(c2)==1){
                    return false;
                }
            }
            else if(m.get(c1)!=c2){
                return false;
            }
        }
        return true;
        
    }
    
}

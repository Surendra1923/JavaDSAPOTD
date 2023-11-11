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

package gfgpotd;
import java.util.*;

public class isomorphic_strings {

    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;
        
        HashMap<Character,Character> m=new HashMap<>();
        
        for(int i=0; i<str1.length() ; i++){
            
            if(m.containsKey(str1.charAt(i))) {
                
                if(m.get(str1.charAt(i))!=str2.charAt(i)){
                    return false;
                }
            }
            else{
                
                if(m.containsValue(str2.charAt(i))){
                    
                    return false;
                }
                m.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
        
    }
    
}

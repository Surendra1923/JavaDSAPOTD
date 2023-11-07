/*
 * Given a square matrix of size N*N, print the sum of upper and lower triangular elements. 
 * Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it.
 * 
 *  Input:
N = 3 
mat[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 
29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29.
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.
 */



package gfgpotd;
import java.util.*;

public class Sum_upper_lower_riangles {
	
	
	
static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int suml=0;
        int sumu=0;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                
                suml+=(matrix[i][j]);
            }
            
            for(int m=n-1;m>=i;m--){
                
                sumu+=matrix[i][m];
            }
        }
        ans.add(sumu);
        ans.add(suml);
        return ans;
    }

}

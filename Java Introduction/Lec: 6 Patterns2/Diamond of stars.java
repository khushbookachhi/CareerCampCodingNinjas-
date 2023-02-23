Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
     	 int n1= (n+1)/2;
   for(int i=1; i<=n1; i++){
      for(int j=1; j<=(n1-i); j++){
          System.out.print(" ");
      }
      for(int j=1; j<=(2*i-1); j++){
          System.out.print("*");
      }
      System.out.println();
   }
   int n2=n1-1;
   for(int i=n2; i>=1;i--){
       for(int j=1; j<=(n2-i+1); j++){
           System.out.print(" ");
       }
       for(int j=1; j<=(2*i-1); j++){
           System.out.print("*");
       }
       System.out.println();
   }
        
    }
}  
  

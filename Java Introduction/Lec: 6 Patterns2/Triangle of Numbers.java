Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
          1
         232
        34543
       4567654
      567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
             
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		n= s.nextInt();
		int i=1;
		while(i<=n){
		    int space=1;
		    while(space<=(n-i)){
		        System.out.print(" ");
		        space= space+1;
		    }
		    int star=1, count=i;
		    while(star<=(i)){
		       
		        System.out.print(count);
		       count++;
		        star= star+1;
		    }
		    int dec= 2*i-2;
		    while(dec>=i){
		        System.out.print(dec);
		        dec= dec-1;
		    }
		  //  count= count-1;
		    i=i+1;
		    	System.out.println();
		}
		
	}
}
             

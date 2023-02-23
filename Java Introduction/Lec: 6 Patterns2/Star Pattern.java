Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 
 import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= (n - i)) {
				System.out.print(" ");
				space = space + 1;
			}
			int star = 1;
			while (star <= (i)) {

				System.out.print("*");

				star = star + 1;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print("*");
				dec = dec - 1;
			}
			// count= count-1;
			i = i + 1;
			System.out.println();
		}

		
	}

}
     

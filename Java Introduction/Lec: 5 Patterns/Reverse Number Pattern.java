Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
  import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
		int n;
		n= s.nextInt();
		int i=1;
		int p=1;
		while(i<=n){
		    int j=1;
		    p=i;
		    while(j<=i){
		        System.out.print(p);
		        p=p-1;
		        j=j+1;
		       
		    }
		   System.out.println();
		    i=i+1;
		}
		
	}

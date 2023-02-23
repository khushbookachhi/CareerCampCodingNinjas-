Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
  
  import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
			Scanner s= new Scanner(System.in);
		int n;
		n= s.nextInt();
		int i=1,count=n;
		while(i<=n){
		  //  int space=1;
		  //  while(space<=(n-i)){
		  //      System.out.print(" ");
		  //      space= space+1;
		  //  }
		    int star=1;
		    while(star<=(n-i+1)){
		       
		        System.out.print(count);
		       
		        star= star+1;
		    }
		    count= count-1;
		    i=i+1;
		    	System.out.println();
		}
		

		
	}

}

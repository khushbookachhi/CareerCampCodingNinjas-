Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
  
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int flag;
for(int i=2; i<=n; i++){
	flag=1;
	for(int j=2; j*j<=i; j++){
		if(i%j==0){
			flag=0;
			break;
		}
	}
	if(flag==1){
	System.out.println(i);
	}
}
	}
		
}  

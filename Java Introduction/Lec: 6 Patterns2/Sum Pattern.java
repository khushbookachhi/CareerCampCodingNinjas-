Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		n= s.nextInt();
		int i, j;
		for( i=1; i<=n; i++){
			int num=1, sum=0;
			for(j=1; j<=i; j++){
				System.out.print(num+"");
				sum=sum+num;
				if(num<i){
					System.out.print("+");
				}
				num++;
			}
			System.out.print("="+sum);
			System.out.println();
		}

	}
}
  

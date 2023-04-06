Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
  
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
  for(int i=1; i<=n; i++){
    int count=2*i-1; int num=1;
    for(int j=1; j<=n-i+1; j++){
        System.out.print(count);
        count=count+2;
    }
    for(int j=1; j<=i-1; j++){
        System.out.print(num);
        num=num+2;
    }
    System.out.println();
}
	}
}  

************another way////////////
	for(int i=1; i<=n; i++){
    for(int j=i; j<=n; j++){
      System.out.print(2*j-1);  
    }
    for(int j=1; j<i; j++){
        System.out.print(2*j-1);  
    }
    System.out.println();
}

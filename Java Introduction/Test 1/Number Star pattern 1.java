Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
   
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
int n= s.nextInt();
int count;
for(int i=1; i<=n; i++){
    count=n;
    for(int j=1; j<=(n-i); j++){
        System.out.print(count);
        count--;
    }
    System.out.print("*");
   int digit=i-1;
    for(int j=1; j<=i-1; j++){
         
       System.out.print(digit);  
       digit--;
    }
    System.out.println();
}



	}
}   

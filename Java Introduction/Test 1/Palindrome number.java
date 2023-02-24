Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
  
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= new int[n+1];
		int i=1,count=0;
		int d;
		while(n>0){
			d=n%10;
			n=n/10;
			arr[i]=d;
			i++;
			count++;
		}
		//System.out.print(count);
		boolean ispalin= true;
		for( i=1; i<=count/2; i++){
			if(arr[i]==arr[count-i+1]){
            ispalin= true;
			}
			else{
			    ispalin= false;
			}
		}
		System.out.print(ispalin);


	}
}
  

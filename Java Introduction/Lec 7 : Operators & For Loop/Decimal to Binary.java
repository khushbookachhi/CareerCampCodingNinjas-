Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
  
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dec_num, quot, i=1,j;
		int bin_num[]= new int[100];
		dec_num= scan.nextInt();
		quot=dec_num;
		if(quot==0){
			System.out.print("0");
		}
		while(quot!=0){
			bin_num[i++]= quot%2;
			quot=quot/2;
		}
		for(j=i-1;j>0;j--){
			System.out.print(bin_num[j]);
		}
		System.out.print("\n");
		
	}
}
  

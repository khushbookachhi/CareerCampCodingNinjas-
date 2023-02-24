Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    

public class Solution {
	
	public static boolean checkMember(int n){
			boolean fibo= false;
			if(n==0){
				fibo= true;
			}
			int sum=0;
			int p = 0, c = 1;
			while(fibo!= true ){
				sum= p+c;
				if(sum==n){
					fibo= true;
					
				}
				if(sum>n){
					fibo= false;
					break;
				}
				p=c;
				c=sum;
			}	
	
return fibo;
	}
	

}
  
  

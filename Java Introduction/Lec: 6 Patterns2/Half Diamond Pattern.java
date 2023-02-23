Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in); 
       	int n= s.nextInt();
		
		int m= 2*n+1;
		int count, j;
        if(n==0){
          System.out.println("*");  
            
        }
		for(int i=1; i<=(m+1)/2; i++){
		  
		  count=1;
		 
		    for( j=1; j<=(2*i-1); j++){
		          if(j==1){
		            System.out.print("*");
		        }
		  
		        
		  if(count<i){
		          System.out.print(count);
		               count++;
		               
		           }
		       }
		   count=count-2;
		  for( j=1; j<=i-2; j++){
		   System.out.print(count); 
		   count--;
		     if(j==(i-2)){
		            System.out.print("*");
		        }
		  
		  }
		  if(i==2){
		    System.out.print("*");  
		  }
		    
		    System.out.println();
		}
		for(int i=(m-n-1); i>=1; i--){
		     count=1;
		    for( j=1; j<=(2*i-1); j++){
		        if(j==1){
		            System.out.print("*");
		        }
		   
		   if(count<i){
		   System.out.print(count);
		    count++;
		       }
		           }
		           count=count-2;
		  for( j=1; j<=i-2; j++){
		   System.out.print(count); 
		   count--;
		     if(j==(i-2)){
		            System.out.print("*");
		        }
		  
		  }
		   if(i==2){
		    System.out.print("*");  
		  }
		    
		    System.out.println();
		}
		
        
    }
}

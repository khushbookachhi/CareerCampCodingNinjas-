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
	    int j;
	for(int i=1; i<=(n+1); i++){
	    int count=1;
	    for( j=1; j<=i; j++){
	        if(j==1){
	            System.out.print("*");
	        }
	        if(count<i){
	            System.out.print(count);
	            count++;
	        }
	    }
	    count=count-2;
	    for(; j<=(2*i-1); j++){
	        if(j==(2*i-1)){
	            System.out.print("*");
	        }else{
	            System.out.print(count);
	            count--;
	        }
	    }
	    System.out.println();
	}
	for(int i=n; i>=1; i--){
	     int count=1;
	    for( j=1; j<=i; j++){
	        if(j==1){
	            System.out.print("*");
	        }
	        if(count<i){
	            System.out.print(count);
	            count++;
	        }
	    }
	    count=count-2;
	    for(; j<=(2*i-1); j++){
	        if(j==(2*i-1)){
	            System.out.print("*");
	        }else{
	            System.out.print(count);
	            count--;
	        }
	    }
	    System.out.println();
	}
        
    }
}

************ another way///////////////
		int m=3;
	int n=m*2+1;
	
	for(int i=1; i<=(n/2)+1; i++){
	    int count=1;
	    int new1=2;
	    for(int j=1; j<=2*i-1; j++){
	       if(j==1 || j==2*i-1){
	        System.out.print("*"); 
	       }else if(count<i){
	          System.out.print(count); 
	          count++;
	       }else{
	           new1=count-new1;
	           System.out.print(new1); 
	          new1++;
	       }
	    }
	    System.out.println();
	}
	for(int i=n/2; i>=1; i--){
	   
	    
	       int count=1;
	    int new1=2;
	    for(int j=1; j<=2*i-1; j++){
	       if(j==1 || j==2*i-1){
	        System.out.print("*"); 
	       }else if(count<i){
	          System.out.print(count); 
	          count++;
	       }else{
	           new1=count-new1;
	           System.out.print(new1); 
	          new1++;
	       }
	  
	    }
	    System.out.println();
	    
	}

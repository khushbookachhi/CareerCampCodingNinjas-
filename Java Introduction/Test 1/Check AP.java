Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
  
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
int n= s.nextInt();
int[] arr= new int[n+1];
if(n==1){
    System.out.print("true");
}
for(int i=0; i<n; i++){
    arr[i]= s.nextInt();
}

boolean isAp=true;
for(int i=2; i<n; i++){
    int d= arr[1]-arr[0];
   
    if(arr[i]-arr[i-1]!=d){
        isAp=false;
    }
   
}
if(isAp==true){
   System.out.print("true"); 
}
else{
     System.out.print("false");
}

	}
}
  

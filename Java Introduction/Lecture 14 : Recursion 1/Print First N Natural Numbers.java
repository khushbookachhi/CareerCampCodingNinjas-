Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
  
  public class Solution {
public static int natural(int y, int j) {
	if (j <= y) {
	return j;
	}
	return 1;
}
	public static void print(int n){
		int j=2;
		int arr[]= new int[n];
		arr[0]=1;
		System.out.print(arr[0]+" ");
		for(int i=1; i<n; i++){
			arr[i]=natural(n,j++);
			System.out.print(arr[i]+" ");
		}
}
}

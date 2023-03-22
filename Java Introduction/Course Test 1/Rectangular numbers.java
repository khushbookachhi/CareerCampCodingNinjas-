Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333
  
  public class solution {

	public static void print(int n) {
int start=0;
int end=n-1;
int count=n;
for(int i=0; i<(2*n-1); i++){
	for(int j=0; j<(2*n-1); j++){
		if(i==0 || i==n-1 || j==0 || j==n-1){
			System.out.print(count);
		//start++; end--;
		}
		
	}
	count--;
	System.out.println();
}
	}

}

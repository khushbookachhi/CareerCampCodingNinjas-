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
  int arr[][]=new int[2*n-1][2*n-1];
  int  start=0, end=2*n-2;
  int size=2*n-1;
    while(n>0){
    for(int i=start; i<=(end); i++){
	for(int j=start; j<=(end); j++){
		if(i==start || i==end || j==start || j==end){
			arr[i][j]=n;
		
		}
		
	}

    }
    	start++; end--;
		n--;
    }
    for(int i=0; i<(size); i++){
	for(int j=0; j<(size); j++){

	System.out.print(arr[i][j]);
}
System.out.println();

}

}

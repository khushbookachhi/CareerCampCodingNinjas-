Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
  
  public class solution {
 
 public static void conquer(int input[], int si, int mid, int ei){
	 int merged[]= new int[ei-si+1];
	 int idx1= si; int idx2=mid+1; int x=0;
	 while(idx1<=mid && idx2<=ei){
		 if(input[idx1]<=input[idx2]){
			 merged[x++]=input[idx1++];
		 }
		 else{
			 merged[x++]=input[idx2++];
		 }
	 }
	 while(idx1<=mid){
		 merged[x++]=input[idx1++];
	 }
	 	while (idx2 <= ei) {
			merged[x++] = input[idx2++];
		}
		for(int i=0, j=si; i<merged.length; i++, j++){
			input[j]=merged[i];

		}
 }
 public static void divide(int input[], int si, int ei){
	 if(si>=ei){
		 return ;
	 }
    int  mid=si+(ei-si)/2;
	divide(input, si, mid);
	divide(input, mid+1, ei);
	conquer(input, si, mid,ei);
 }
	public static void mergeSort(int[] input){
		int n=input.length;
		int si=0;
		int ei= n-1;
		divide(input,si,ei);


		
	}
}

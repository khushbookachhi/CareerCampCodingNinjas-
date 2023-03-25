Sort an array A using Quick Sort.
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
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
  
  public class Solution {
	
	public static int partition(int input[], int low, int high){
		int pivot= input[high];
		int i=low-1;
		for(int j=low; j<high; j++){
			if(input[j]<pivot){
				i++;
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
		i++;
		int temp=input[i];
		input[i]=pivot;
		input[high]=temp;
		return i;
	}
	public static void quickSorting(int input[], int low, int high){
		if(low<high){
			int pidx= partition(input,low,high);
			quickSorting(input, low, pidx-1);
			quickSorting(input, pidx+1, high);
		}
	}
	public static void quickSort(int[] input) {
		int n=input.length;
		quickSorting(input, 0, n-1);
	}
	
}

Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
Note: Space complexity should be O(1).
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains array elements after sorting. The elements of the array in the output are separated by single space.
Constraints :
1 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1:
6 
2 6 8 5 4 3
Sample Output 1:
8 6 5 4 3 2

  
public class Solution {

public static void fixOrder(int arr[]) {
		for(int i=arr.length-1; i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			int parentindex=0;
			int leftchildindex=2*parentindex+1;
			int rightchildindex=2*parentindex+2;
			
			while(leftchildindex<i) {
				int minindex=parentindex;
				if(arr[leftchildindex]<arr[minindex]) {
					minindex=leftchildindex;}
				if(rightchildindex<i && arr[rightchildindex]<arr[minindex]) {
					minindex=rightchildindex;}
				if(minindex==parentindex) {
					break;}
				int temp2=arr[minindex];
				arr[minindex]=arr[parentindex];
				arr[parentindex]=temp2;
				      
					parentindex=minindex;
					leftchildindex=2*parentindex+1;
					rightchildindex=2*parentindex+2;
				}
			}
		}
	
	public static void buildHeap(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int childindex=i;
			int parentindex=(i-1)/2;
			while(childindex>0) {
				if(arr[childindex]<arr[parentindex]) {
					int temp=arr[childindex];
					arr[childindex]=arr[parentindex];
					arr[parentindex]=temp;
					childindex=parentindex;
					parentindex=(childindex-1)/2;
				}else {
					break;
				}
			}
		}
	}
	
	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		buildHeap(arr);
		fixOrder(arr);
	}
}

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
  
  public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
        int n= arr.length;
    		for(int i=1; i<n; i++){
        int current= arr[i];
        int j=i-1;
        while( j>=0 &&arr[j]>current){
            arr[j+1]= arr[j];
            j--;
        }
        arr[j+1]=current;
    }
		int duplicate=1;
		for(int i=0; i<n; i++){
		    for(int j=i+1; j<n; j++){
		        if(arr[i]==arr[j]){
		           duplicate= arr[i];
		           break;
		        }
		    }
		  
		}
        return duplicate;
    }
}

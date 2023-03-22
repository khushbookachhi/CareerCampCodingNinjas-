You are given an integer array, arr, of size N and a positive integer K. Out of all subarrays of 'arr' of size K, find the sum of the subarray that has the maximum sum.
Input format:
The first line of the input contains two space-separated integers, N and K
The second line contains N space-separated integers which represent the elements of the array, arr
Output format:
The output only consists of a single integer, the sum of the subarray that has the maximum sum
Constraints:
1 <= N <= 10^6
1 <= K <= N
Time limit: 1 sec 
Sample Input 1:
4 1
1 2 3 4
Sample Output 1:
4
Sample Input 2:
6 2
2 7 3 6 7 7 
Sample Output 2:
14
Explanation for Sample Output 2:
There are 5 subarrays of size 2 in this array. They are {2, 7}, {7, 3}, {3, 6}, {6, 7}, {7, 7}. Since the subarray {7, 7} has the maximum sum among all the subarrays, the output will be 7 + 7 = 14
  
  import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int k=s.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
    arr[i]=s.nextInt();
    }
    int count=1;
    int max_sum=0, curr_sum=0;
    if(n<k){
      return;
    }
    for(int i=0; i<=n-k; i++){
      int j=i+1;
       if(curr_sum>max_sum){
          max_sum=curr_sum;
        }
        curr_sum=0;
      for(count =1; count<k; count++){
       
        curr_sum+=arr[i]+arr[j];
        j++;
      }
    }
      System.out.print(max_sum);
    }
}

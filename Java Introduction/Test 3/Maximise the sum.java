Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
  
  public class Solution {
public static long max(long s1, long s2){
	if(s1>s2){
		return s1;
	}
	else{
		return s2;
	}
}
	public static long maximumSumPath(int[] input1, int[] input2) {
int n= input1.length;
int m= input2.length;
 long maxsum=0;
    long s1=0,s2=0;
    int i=0,j=0;
    
    while(i<n && j<m){
        if(input1[i]<input2[j]){
            s1+=input1[i];
            i++;
        }
        else if(input1[i]>input2[j]){
            s2+=input2[j];
            j++;
        }
        else{
            maxsum+=max(s1,s2)+input1[i];
            s1=0; s2=0;
            i++;
            j++;
        }
    }
   
    while (i<n)
        s1+=input1[i++];
    while (j<m)
        s2+=input2[j++];
    maxsum+=max(s1,s2);
    return maxsum;
    
	}
}

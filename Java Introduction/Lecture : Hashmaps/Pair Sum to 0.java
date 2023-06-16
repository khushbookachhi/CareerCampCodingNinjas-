Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
Note: Array A can contain duplicate elements as well.
Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output format :
The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
Constraints :
0 <= N <= 10^4
Time Limit: 1 sec
Sample Input 1:
5
2 1 -2 2 3
Sample Output 1:
2

  import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		 if (size==0)
            return 0;
        int countPair=0;
      
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i: input){
            if(h.containsKey(-i) && h.get(-i)!=0){
                countPair+=h.get(-i);
            }
            if(h.containsKey(i)){
                h.put(i, h.get(i)+1);
            }else{
                h.put(i, 1);
            }
        }
        return countPair;
 
	}
}

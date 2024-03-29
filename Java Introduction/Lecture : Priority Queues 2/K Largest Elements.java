You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k largest numbers from given array. You need to save them in an array and return it.
Time complexity should be O(nlogk) and space complexity should be not more than O(k).
Order of elements in the output is not important.
Input Format :
Line 1 : Size of array (n)
Line 2 : Array elements (separated by space)
Line 3 : Integer k
Output Format :
k largest elements
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output :
12
16
20
25

  
import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        ArrayList<Integer> output= new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0; i<k ; i++){
            pq.add(input[i]);
        }
        for(int i=k; i<input.length; i++){
            int peekele=pq.peek();
            if(peekele<input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
      while(!pq.isEmpty()){
          output.add(pq.poll());
      }
     return output;   
    }
}

Given a linked list that contain some random integers from 1 to n with many duplicates. You need to replace each duplicate element that is present in the linked list with the values n+1, n+2, and so on (starting from left to right in given LL).
For eg. if input linked list is
1 3 1 4 4 2 1 -1
updated linked list should be -
1 3 5 4 6 2 7
n in the list is 4, so I have to replace each duplicate from left to right with 4, 5 and so on. In that way, element 1 (which is at index 2) will be replaced by 5, element 4 (which is present at index 4) by 6 and element 1 (which is present at index 6) by 7.
You don't need to print the elements, just update the elements in LL.
Input format :
Linked list elements (separated by space and terminated by-1)
Output Format :
Updated LL elements (separated by space)
Sample Input 1 :
1 3 1 4 4 2 1 -1
Sample Output 1 :
1 3 5 4 6 2 7
  
  /******** 
Following is the structure of Linked list node
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}
*********/

public class solution {

	public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
		 int max = 0;
        LinkedListNode<Integer> temp = head; while (temp != null) 
		{
            if (temp.data > max) 
			{
				 max = temp.data;
            }
            temp = temp.next;
        }
    	boolean done[] = new boolean[max + 1];
        for (int i = 0; i <= max; i++) 
    	{
            done[i] = false;
        }
        temp = head;
        while (temp != null) 
	    {
            if (done[temp.data]) 
	    	{
                temp.data = max + 1;
                max++;
            } 
		    else 
		    {
	            done[temp.data] = true;
            }
            temp = temp.next;
        }

	}
}

You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space. 

The second line of the input contains the elements of the second sorted singly linked list separated by a single space. 
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output :
For each test case/query, print the resulting sorted singly linked list, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists. 

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12 
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12 
10 10 20 30 40 40 50 60 60 60 80 90 100
  
  /*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> t1, LinkedListNode<Integer> t2) {
        //Your code goes here
     if(t1==null && t2==null) {
    		return null;
    	}else if(t1!=null && t2==null) {
    		return t1;
    	}else if(t2!=null && t1==null){
    		return t2;
    	}
      LinkedListNode<Integer> head=null ,tail=null;
    	if(t1.data<t2.data) {
    		head=t1;
    		t1=t1.next;
    	}else {
    		head=t2;
    		t2=t2.next;
    	}
        tail=head;
    	while(t1!=null && t2!=null) {
    		if(t1.data<t2.data) {
    			tail.next=t1;
    			tail=t1;
    			t1=t1.next;
    		}else {
    			tail.next=t2;
    			tail=t2;
    			t2=t2.next;
    		}
    	}
    	if(t1!=null){
    		tail.next=t1;
    	}
    	if(t2!=null){
    		tail.next=t2;
    	}
    	return head;
    }

}

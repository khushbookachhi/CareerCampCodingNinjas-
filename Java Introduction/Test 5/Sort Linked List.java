Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and space complexity should be O(1).
You just need to return the head of sorted linked list, don't print the elements.
Input format :
Line 1 : Linked list elements of length L (separated by space and terminated by -1)
Line 2 : Integer n
Output format :
Updated list elements (separated by space)
Sample Input 1 :
10 40 53 30 67 12 89 -1
Sample Output 1 :
10 12 30 40 53 67 89
  
  public class Solution 
{
    public static LinkedListNode<Integer> reverse (LinkedListNode<Integer> head)
	{
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null; 
	    LinkedListNode<Integer> fwd = null;
        while (curr != null)
	    {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) 
	{
        if (head == null || head.next == null) 
		{
			return head; 
        }
        LinkedListNode<Integer> ascendingListHead = null;
        LinkedListNode<Integer> ascendingListTail = null;
        LinkedListNode<Integer> decendingListHead = null;
		LinkedListNode<Integer> decendingListTail = null;
        LinkedListNode<Integer> temp = head;
        ascendingListHead = temp; 
		ascendingListTail = temp;
        temp= temp.next;
        decendingListHead = temp; 
		decendingListTail = temp;
        temp = temp.next;
        while(temp != null) 
		{
            ascendingListTail.next = temp; 
			ascendingListTail = ascendingListTail.next;
            temp = temp.next;
            if(temp != null) 
			{
                decendingListTail.next = temp; 
				decendingListTail = decendingListTail.next;
                temp = temp.next;
            }
		}
        ascendingListTail.next = null; 
        decendingListTail.next = null;
        decendingListHead = reverse (decendingListHead);
        return mergeTwoList(ascendingListHead, decendingListHead);
    }
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) 
	{ 
		LinkedListNode<Integer> head = null, tail = null;
        if (head1.data < head2.data) {
        head = head1; 
		tail = head1;
        head1= head1.next;
    } 
	else if(head2.data < head1.data) 
	{
        head = head2;
        tail = head2;
        head2 = head2.next;
    } 
	else 
	{
		head = head1;
        tail = head1;
        head1= head1.next;
        tail.next = head2;
        tail = tail.next;
        head2 = head2.next;
    }
    while (head1 != null && head2 != null) 
	{ 
		if (head1.data < head2.data) 
	    {
            tail.next = head1;
            tail = tail.next;
            head1 = head1.next;
        }
	    else if(head2.data < head1.data)
	    { 
		    tail.next = head2; 
			tail = tail.next; 
			head2 = head2.next;
        } 
	    else 
	    {
            tail.next = head1; 
			tail = tail.next; 
			head1 = head1.next; 
			tail.next = head2; 
			tail = tail.next; 
			head2 = head2.next;
        }
    }
    if (head1 != null) 
	{ 
		tail.next = head1;
    }
    if (head2 != null)
    { 
		tail.next = head2;
    }
     return head;
}
}

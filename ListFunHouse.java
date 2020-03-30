//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;


public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while (list != null) {
		   System.out.print(list.getValue() + " ");
		   list = list.getNext();
	   }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
	   	int count=0;
	   	while (list != null) {
	   		count++;
	   		list = list.getNext();
	   	}
	   	return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static ListNode doubleFirst(ListNode list)
	{
		list = new ListNode(list.getValue(), list);
		return list;
		

	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static ListNode doubleLast(ListNode list)
	{
   	ListNode temp = list;
   	while (temp.getNext() != null) {
   		temp = temp.getNext();
   	}
   	temp.setNext(new ListNode(temp.getValue(), null));
	return list;
	}
	

	//this method will set the value of every xth node in the list
	public static ListNode setXthNode(ListNode list, int x, Comparable value)
	{
		ListNode current = list;
		int count=1;

		while (current.getNext() != null) {
			current = current.getNext(); // increment current by 1
			count++; // increment counter
			if (count == x) { // if pointing at xth node
				current.setValue(value);
				count=1; // reset counter
				current = current.getNext();
			}
		}
		return list;
	}	

	//this method will remove every xth node in the list
	public static ListNode removeXthNode(ListNode list, int x)
	{
		ListNode current = list;
		ListNode previous = current;
		int count=1;
		
		try {
			while (current.getNext() != null) {
				previous = current; // set the previous node to the current node

				current = current.getNext(); // increment current by 1
				count++; // increment counter
				if (count == x) { // if pointing at xth node
					previous.setNext(current.getNext()); // set previous node's 'next' pointer to x nodes ahead
					count=1; // reset counter
					current = current.getNext(); // set current value to previous's 'next' pointer
				}
			}
			return list;
			
		} catch (Exception e) {
			return list;
		}
		
	}
}
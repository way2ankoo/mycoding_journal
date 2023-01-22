package Linkedlist1;

public class LinkedList1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.next = temp2;
		
		printList(head);
		head = insertFirst(head, 40);
		System.out.println();
		printList(head);
		System.out.println();
		head = insertEnd(head, 50);
		printList(head);
		

	}
	
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	

	public static Node insertFirst(Node head, int x) {
		Node newNode = new Node(x);
		newNode.next = head;
		return newNode;
		
	}
	
	public static Node insertEnd(Node head, int x) {
		Node newNode = new Node(x);
		if(head == null) {
			return newNode;
		}
		Node curr = head;
		while(curr.next!=null)
			curr = curr.next;
		curr.next = newNode;
		return head;
		
	}
	
}

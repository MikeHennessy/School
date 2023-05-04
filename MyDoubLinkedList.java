package sunita.LinkedLists;

public class MyDoubLinkedList {

	private Node head;
	private int len;

    MyDoubLinkedList( ) {
    	head = null;
    }
    
    public void addNode(Node n) {		// add a Node to end of the LinkedList 
    	
    	if (head == null) {
    		head = n;
    		this.len = 0;
    	}
    	else {
    		Node temp = head;
    		while (temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next = n;
    		n.previous = temp;
    		this.len++;
    	}
    }
    
    public void printList( ) {		// print each element in the LinkedList
    	
    	if (head != null) {
    		System.out.println(head.name);
    		Node temp = head;
    		while (temp.next != null) {
    			temp = temp.next;
    			System.out.println(temp.name);
    		}
    	}
    }
    
    public void insertBefore(int index,  Node n) {		// adds Node n before index value 
    	
    	if(len >= index && index >= 0) {
    		if(index == 0) {
    			n.next = head;
    			head.previous = n;
    			this.len++;
    		}
    		else if(index == 1) {
    			n.next = head.next;
    			n.previous = head;
    			head.next.previous = n;
    			head.next = n;
    			this.len++;
    		}
    		else {
	    		Node temp = head;
	    		int count = 0;
	    		while (count < (index - 1)) {
	    			temp = temp.next;
	    			count++;
	    		}
	    		n.next = temp.next;
	    		n.previous = temp;
	    		temp.next.previous = n;
	    		temp.next = n;
	    		this.len++;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }
    
    public void insertAfter(int index,  Node n) {		// adds Node n after index value
    	
    	if(len >= index && index >= 0) {
    		if(index == 0) {
    			n.next = head.next;
    			n.previous = head;
    			head.next.previous = n;
    			head.next = n;
    			this.len++;
    		}
    		else {
	    		Node temp = head;
	    		int count = 0;
	    		while (count < index) {
	    			temp = temp.next;
	    			count++;
	    		}
	    		n.next = temp.next;
    			n.previous = temp;
    			temp.next.previous = n;
    			temp.next = n;
	    		this.len++;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }
    
    public int indexOf(String str) {		//returns index of where String str  is at.  Returns -1 if String str is not in LinkedList
    	
    	Node temp = head;
    	for(int i = 0; i <= len; i++) {
    		if(temp.name != null && temp.name.equalsIgnoreCase(str)) {
        		return i;
        	}
    		temp = temp.next;
    	}
    	return -1;
    }
    
    public void removeNodeAt(int index) {		// removes Node at index value
    	
    	if(len >= index && index >= 0) {
    		if(index == 0) {
    			head = head.next;
    			head.previous = null;
    			this.len--;
    		}
    		else if(index == 1) {
    			head.next = head.next.next;
    			head.next.previous = head;
    			this.len--;
    		}
    		else {
	    		Node temp = head;
	    		int count = 0;
	    		while (count < (index-1)) {
	    			temp = temp.next;
	    			count++;
	    		}
	    		temp.next = temp.next.next;
    			temp.next.previous = temp;
	    		this.len--;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }
	
	public static void main(String[] args) {
		
		// create nodes
		Node blank = new Node();
		Node seasons = new Node("Seasons");
		Node spring = new Node("Spring");
		Node summer = new Node("Summer");
		Node fall = new Node("Fall");
		Node winter = new Node("Winter");
		
		// create doubly linked list and add nodes
		MyDoubLinkedList testList = new MyDoubLinkedList();
		testList.addNode(blank);
		testList.addNode(seasons);
		// testList.addNode(spring);
		testList.addNode(summer);
		// testList.addNode(fall);
		testList.addNode(winter);
		
		// print each element in the doubly linked list
		testList.printList();

		// test insert before method
		testList.insertBefore(2, spring);
		// print each element in the doubly linked list
		testList.printList();
		
		// test insert after method
		testList.insertAfter(3, fall);
		// print each element in the doubly linked list
		testList.printList();
		
		// test index of method
		System.out.println(testList.indexOf("winter"));
		
		// test remove node at method
		testList.removeNodeAt(1);
		// print each element in the doubly linked list
		testList.printList();
		
	}

}

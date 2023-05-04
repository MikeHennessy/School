package sunita.LinkedLists;

public class MyCirLinkedList {

	CNode start;
	CNode end;
	public int size;
	
	public MyCirLinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void add(int n) {
		
		CNode temp = new CNode(n, null);
		temp.setLink(start);
	    if (isEmpty()) {
	        start = temp;
	        temp.setLink(start);
	        end = start;
	        this.size = 0;
	    }
	    else {
	    	  end.setLink(temp);
	    	  start = temp;
	    }
	    this.size++;
	}
	
	public void printList( ) {		// print each element in the LinkedList
		
		if (!isEmpty()) {
    		System.out.println(start.getData());
    		CNode temp = start;
    		while (temp.getLink() != start) {
    			temp = temp.getLink();
    			System.out.println(temp.getData());
    		}
    	}
	}
	
    public void insertBefore(int index, CNode n)  {		// adds Node n before index value
    	
    	if(getSize() >= index && index >= 0) {
    		if(index == 0) {
    			n.setLink(start);
    			end.setLink(n);
    			this.size++;
    		}
    		else if(index == 1) {
    			n.setLink(start.getLink());
    			start.setLink(n);
    			this.size++;
    		}
    		else {
	    		CNode temp = start;
	    		int count = 0;
	    		while (count < (index - 1)) {
	    			temp = temp.getLink();
	    			count++;
	    		}
	    		n.setLink(temp.getLink());
	    		temp.setLink(n);
	    		this.size++;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }
    
    public void insertAfter(int index, CNode n)  {		// adds Node n after index value
    	
    	if(getSize() >= index && index >= 0) {
    		if(index == 0) {
    			n.setLink(start.getLink());
    			start.setLink(n);
    			this.size++;
    		}
    		else {
	    		CNode temp = start;
	    		int count = 0;
	    		while (count < index) {
	    			temp = temp.getLink();
	    			count++;
	    		}
	    		n.setLink(temp.getLink());
	    		temp.setLink(n);
	    		this.size++;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }
    
    public int  indexOf(int data) {		// returns index of where String str is at. Returns -1 if String str is not in linked list
    	
    	CNode temp = start;
    	for(int i = 0; i < getSize(); i++) {
    		if(temp.getData() == data) {
        		return i;
        	}
    		temp = temp.getLink();
    	}
    	return -1;
    }
    
    public void removeNodeAt(int index) {		// removes Node at index value

    	if(getSize() >= index && index >= 0) {
    		if(index == 0) {
    			start = start.getLink();
    			this.size--;
    		}
    		else if(index == 1) {
    			start.setLink(start.getLink().getLink());
    			this.size--;
    		}
    		else {
    			CNode temp = start;
	    		int count = 0;
	    		while (count < (index - 1)) {
	    			temp = temp.getLink();
	    			count++;
	    		}
	    		temp.setLink(temp.getLink().getLink());
	    		this.size--;
    		}
    	}
    	else {
    		System.out.println("The input index does not exist.");
    	}
    }

	public static void main(String[] args) {
		
		// create doubly linked list and add nodes
		MyCirLinkedList testList = new MyCirLinkedList();

		testList.add(5);
		testList.add(4);
		// testList.add(3);
		testList.add(2);
		// testList.add(1);
		testList.add(0);
		
		// create CNodes to be used later
		CNode three = new CNode(3, null);
		CNode one = new CNode(1, null);
		
		// print each element in the circular linked list
		testList.printList();
		
		// test insert before method
		testList.insertBefore(2, three);
		// print each element in the circular linked list
		testList.printList();
		
		// test insert after method
		testList.insertAfter(0, one);
		// print each element in the circular linked list
		testList.printList();
		
		// test index of method
		System.out.println(testList.indexOf(5));
		
		// test remove node at method
		testList.removeNodeAt(1);
		// print each element in the circular linked list
		testList.printList();
		
	}

}

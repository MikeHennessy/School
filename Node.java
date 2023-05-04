package sunita.LinkedLists;

class Node {

	public String name;
    public Node next;
    public Node previous;
    
    Node( ) {
    	this.next = null;
    	this.previous = null;
    }
    
    Node(String  s) {		// set the name 
    	this.name = s;
    	this.next = null;
    	this.previous = null;
    }

}

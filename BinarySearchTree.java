package sunita.BinarySearchTree;

public class BinarySearchTree {

    private BSTNode root;
    private int size = 0;

    BinarySearchTree(){
        root = null;
    }

    BinarySearchTree(int i){
        root = new BSTNode(i);
        tracksize();
    }

    // assuming you have the first 3 elements of the binary tree
    BinarySearchTree(int i, int y, int w){
		root = new BSTNode(i);
		tracksize();
		 if(y < i &&  w > y){
		     root.left = new BSTNode(y);
		     tracksize();
		     root.right = new BSTNode(w);
		     tracksize();
		     root.left.left=root.left.right=null;  
		     root.right.left=root.right.right=null; 
		 }
		 else if (y > i &&  w < i){
			 root.left = new BSTNode(w);
			 tracksize();
		     root.right = new BSTNode(y);
		     tracksize();
		     root.left.left=root.left.right=null;  
		     root.right.left=root.right.right=null;    
		 }
    }

    // insert using recursion
    private BSTNode insert_add(BSTNode curr, int i){

        // check if the value is a duplicate
        if(curr==null||size==0){
            curr = new BSTNode(i);
            tracksize();
        }
        else if(i == curr.elem){
        	System.out.println("The value already exists in the Tree");
        }

        /*remember the rule which is that the left child node's value must always be 
        of a lesser value than it's direct parent so here we check*/
        else if(i < curr.elem){
            curr.left = insert_add(curr.left, i);
            
        }
        else{
            curr.right = insert_add(curr.right, i);
           
        }    
        
        return curr;
    }

    void insert(int i){
    	BSTNode trav = root;
        trav = insert_add(trav, i);   
    }

    // tree traversal method
    private BSTNode traversal(){
	    BSTNode trav;
        trav = root;

        // since insertion always starts from the left, traverse the left node
        while(trav != null){
            trav = trav.left;
        }
        return trav;
    }

    // size tracker
    private void tracksize(){
        this.size++;
    }

    // complete this method
    int search(int i){
    	BSTNode temp;
    	int count = 1;
    	
    	if(i < root.elem) {
        	temp = root.left;
        	count += 2;
    	}
    	else if(i > root.elem) {
    		temp = root.right;
    		count += 2;
    	}
    	else if (i == root.elem){
    		return i;
    	}
    	else {
    		return -1;
    	}
    	
    	while(count <= this.size) {
    		
    		if(i < temp.elem) {
            	temp = root.left;
            	count = count * 2 + 1;
        	}
        	else if(i > temp.elem) {
        		temp = root.right;
        		count = count * 2 + 1;
        	}
        	else if(i == temp.elem){
        		return i;
        	}
    	}
        return -1;
    }

    // complete this method
    int delete(int i){
        return 0;
    }

    void printBT(){
    	BSTNode trav;
        trav = root;
        inorderprint(trav);
        
    }
    
    void printBT(String s){
    	BSTNode trav;
        trav = root;
        if(s.equalsIgnoreCase("pre")) {
        	preorderprint(trav);
        }
        else if (s.equalsIgnoreCase("post")) {
            postorderprint(trav);
         }        
    }
    
    void inorderprint(BSTNode n) {
    	if(n != null){ 
    		inorderprint(n.left);
            System.out.println(n.elem);
            inorderprint(n.right);
        }
    }
    
    void preorderprint(BSTNode n) {
    	if(n != null){ 
    		System.out.println(n.elem);
    		preorderprint(n.left);
            preorderprint(n.right);
        }
    }
    
    
    void postorderprint(BSTNode n) {
    	if(n != null){ 
    		postorderprint(n.left);
            postorderprint(n.right);
            System.out.println(n.elem);
        }
    }
    
    int size(){
        return this.size;
    }
    
    public static void main(String[] args) {
		//MyBT daT = new MyBT(2,5,1);
    	BinarySearchTree daT = new BinarySearchTree(2);
        daT.insert(4);
        daT.insert(3);

        System.out.println("The tree has " + daT.size() + " elements.");
        System.out.println("Here are the elements in the Binary Tree in-order.");
        daT.printBT();
        System.out.println("Here are the elements in the Binary Tree pre-order.");
        daT.printBT("Pre");
        System.out.println("Here are the elements in the Binary Tree post-order.");
        daT.printBT("Post");
        System.out.println("\n" + daT.search(3));
        System.out.println(daT.search(4));
        System.out.println(daT.search(2));
        System.out.println(daT.search(10));
	}
    
}
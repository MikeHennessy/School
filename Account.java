package sunita;

class Account {
	private int id;
	private double balance;
	
	Account() {
		id = 0;
		balance = 0.0;
	}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void setId(int myId) {
		id = myId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setBalance(int myBal) {
		balance = myBal;
	}
	
	public double getBalance() {
		return balance;
	}

    public static void main(String[] args) {
    	Account mary = new Account(5, 1000.0);
    	Account student;
    	student = mary;
    	
    	Account mike = new Account(11, 5000000.0);
    	mike.setBalance(4999999);
    	mike.setId(mike.getId() - 1);
    	System.out.println(mike.getId());
    	System.out.println(mike.getBalance());
    }
}

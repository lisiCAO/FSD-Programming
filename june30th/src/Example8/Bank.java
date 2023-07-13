package Example8;

public class Bank {
	
	private Account[] acountlist;
	int counter = 0 ;
	public Bank() {
		acountlist = new Account[10];
	}
	
	public void addAccount(Account ac) {
		acountlist[counter] = ac;
		counter++;
	}
	
	public void removeac(Account ac) {
		//for()
	}
	
	public void depmoney(Account ac, double am) {
		//for 
		//am.dep(
	}

}

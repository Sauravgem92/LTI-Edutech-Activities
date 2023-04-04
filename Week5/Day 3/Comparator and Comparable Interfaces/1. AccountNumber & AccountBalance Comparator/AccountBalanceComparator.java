
import java.util.Comparator;

public class AccountBalanceComparator implements Comparator<Account> {

	public AccountBalanceComparator() {
		super();
	}

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccountBalance().compareTo(o2.getAccountBalance());
	}

}
   

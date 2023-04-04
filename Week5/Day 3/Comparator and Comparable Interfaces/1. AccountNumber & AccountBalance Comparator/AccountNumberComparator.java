
import java.util.Comparator;

public class AccountNumberComparator implements Comparator<Account>{

    public AccountNumberComparator() {
		super();
	}
	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccountNumber().compareTo(o2.getAccountNumber());
	}

}

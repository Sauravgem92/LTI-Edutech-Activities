
import java.util.Set;
import java.util.TreeSet;

public class NumberSet {
	private Set<Integer> numberSet=new TreeSet<>();

	public NumberSet() {
		super();
	}

	public NumberSet(Set<Integer> numberSet) {
		super();
		this.numberSet = numberSet;
	}

	public void insertElement(Integer num) {
		numberSet.add(num);
	}

	public int SortedSet(int num) {
		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public Set<Integer> getNumberSet() {
		return numberSet;
	}

	public void setNumberSet(Set<Integer> numberSet) {
		this.numberSet = numberSet;
	}

}

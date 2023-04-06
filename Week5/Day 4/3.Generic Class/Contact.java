
public class Contact<T, U> {
	private T _att1;
	private U _att2;

	public Contact(T _att1, U _att2) {
		super();
		this._att1 = _att1;
		this._att2 = _att2;
	}
	
	public void print() {
		if((String.valueOf(_att1)).substring(0,2).equals("91")) {
			System.out.println(_att1);
		}
	}

	public T get_att1() {
		return _att1;
	}

	public void set_att1(T _att1) {
		this._att1 = _att1;
	}

	public U get_att2() {
		return _att2;
	}

	public void set_att2(U _att2) {
		this._att2 = _att2;
	};

}

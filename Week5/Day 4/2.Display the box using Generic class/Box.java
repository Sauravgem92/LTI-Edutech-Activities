public class Box<T> {
	private T length;
	private T width;
	private T depth;

	public Box(T length, T width, T depth) {
		super();
		this.length = length;
		this.width = width;
		this.depth = depth;
	}

	public void print() {
		System.out.println("Length: " + length + "\nWidth: " + width + "\nDepth: " + depth);
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getDepth() {
		return depth;
	}

	public void setDepth(T depth) {
		this.depth = depth;
	}

}

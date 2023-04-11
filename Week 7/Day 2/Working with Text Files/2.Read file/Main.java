import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		StallBO stallBO = new StallBO();

		Stall stall = stallBO.readStallFromFile();

		stallBO.display(stall);
	}

}

package floatingPointUnderflow;

public class Main {
	public static void main(String[] arg) {
		Test test = new Test(1.2345678, 1.2345677, -300);
		test.perform();
	}
}

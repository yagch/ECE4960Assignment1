package naN;

public class Main {
	public static void main(String[] arg) {
		Test test = new Test();
		test.detect(1.0);
		test.detect(0.0/0.0);
		test.prop(2.0);
		test.inter();
        
	}
}

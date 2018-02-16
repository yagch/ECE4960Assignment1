package integerOverflow;

public class Test {
	/**Implement multiplication*/
	public void implMulti(int a, int b) {
		Multiplication Multi = new Multiplication(a, b);
		Multi.output();
	}
	/**Implement factorial*/
	public void implFact() {
		int n = 1;
		int helper = 1;
		while(helper == 1) {
			Factorials Fact = new Factorials(n);
			Fact.output();
			n++;
			if(Fact.isOverflow())
				helper = 0;
		}
	}
	/**Implement Fibonossi*/
	public void implFib() {
		int n = 1;
		int helper = 1;
		while(helper == 1) {
			Fibonossi Fib = new Fibonossi(n);
			Fib.output();
			n++;
			if(Fib.isOverflow())
				helper = 0;
		}
	}
}

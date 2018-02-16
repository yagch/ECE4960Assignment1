package integerDividedBy0;

public class DivideBy0 {
	public int n;    // Set the value of the integer divided by 0
	public DivideBy0(int n) {
		this.n = n;
	}
	/**The result of deviding the integer by 0*/
	public double res() {
		return n/0;
	}
	public void output() {
		System.out.print(this.res());
	}
}

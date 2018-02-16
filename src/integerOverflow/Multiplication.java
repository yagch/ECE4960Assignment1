package integerOverflow;

public class Multiplication {
	public int a;
	public int b;
	public Multiplication(int a, int b) {
		this.a = a;
		this.b = b;
	}
	/**Calculate the result of Multiplication*/
	public int val() {
		return a * b;
	}
	/**Test whether the result has overflowed*/
	public boolean isOverflow() {
		if(this.val()/a != b) {
			return true;
		}
		else {
			return false;
		}
	}
	/**Output the result*/
	public void output() {
		if(!this.isOverflow()) {
			System.out.println(this.a + "*" + this.b + " doesn't overflow, the product is" + this.val());
		}
		else {
			System.out.println(this.a + "*" + this.b + " overflows");
		}
	}
}

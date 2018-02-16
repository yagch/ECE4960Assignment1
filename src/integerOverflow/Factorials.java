package integerOverflow;

public class Factorials {
	public int n;    
	public Factorials(int n) {
		this.n = n;
	}
	/**Calculate the result of factorial*/
	public int val(){
		int t = 1;
		if(n == 0)
			return t;
		for(int i = 1; i <= n; i++) {
			t *= i;
		}
		return t;
	}
	/**Test whether the result has overflowed*/
	public boolean isOverflow() {
		if(n == 0)
			return false;
		else {
			Factorials f = new Factorials(n - 1); 
			if(this.val() / this.n != f.val())
				return true;
			else
				return false;
		}
	}
	/**Output the result*/
	public void output() {
		if(!this.isOverflow()) {
			System.out.println(this.n + "! doesn't overflow, the factorial is" + this.val());
		}
		else {
			System.out.println(this.n + "! overflows");
		}
	}
}

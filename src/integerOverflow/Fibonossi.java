package integerOverflow;

public class Fibonossi {
	public int n;
	public Fibonossi(int n) {
		this.n = n;
	}
	/**Calculate the result of Fibonossi*/
	public int val() {
		if(n == 1 || n == 2) 
			return 1;
		else {
			int[] fib = new int[n];
			fib[0] = 1;
			fib[1] = 1;
			for(int i = 2; i < n; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			return fib[n - 1];
		}
	}
	/**Test whether the result has overflowed*/
	public boolean isOverflow() {
		if(this.val() > 0) 
			return false;
		else
			return true;
	}
	/**Output the result*/
	public void output() {
		if(!this.isOverflow()) {
			System.out.println(this.n + "order Fibonossi doesn't overflow, the factorial is" + this.val());
		}
		else {
			System.out.println(this.n + "order Fibonossi overflows");
		}
	}
}

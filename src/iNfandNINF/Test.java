package iNfandNINF;

public class Test {
	PosINF posINF = new PosINF();
	NegINF negINF = new NegINF();
	public Test() {
		
	}
	/**Observe the behavior of INF and NINF*/
	public void function(int i) {
		if(i > 0) {		
			posINF.divide();
			posINF.sine();
			posINF.exponent();
		}
		if(i < 0) {
			negINF.divide();
			negINF.sine();
			negINF.exponent();
		}
	}
	/**Observe the propogation of INF and NINF*/
	public void prop(double n) {
		if(n > 0) {
			System.out.println("INF + " + n + " = " + (posINF.val() + n));
			System.out.println("INF - " + n + " = " + (posINF.val() - n));
			System.out.println("INF * " + n + " = " + (posINF.val() * n));
			System.out.println("INF / " + n + " = " + (posINF.val() / n));
		}
		if(n < 0) {
			System.out.println("NINF + " + n + " = " + (negINF.val() + n));
			System.out.println("NINF - " + n + " = " + (negINF.val() - n));
			System.out.println("NINF * " + n + " = " + (negINF.val() * n));
			System.out.println("NINF / " + n + " = " + (negINF.val() / n));
		}
		
	}
	/**Observe the interaction of INF and NINF*/
	public void inter() {
		System.out.println("INF + INF = " + (posINF.val() + posINF.val()));
		System.out.println("INF - INF = " + (posINF.val() - posINF.val()));
		System.out.println("NINF + NINF = " + (negINF.val() + negINF.val()));
		System.out.println("INF + NINF = " + (posINF.val() + negINF.val()));
		System.out.println("INF * INF = " + (posINF.val() * posINF.val()));
		System.out.println("INF / INF = " + (posINF.val() / posINF.val()));
	}
	/**Detect whether a number is INF or NINF*/
	public boolean isINF(double x) {
		if (posINF.isPosINF(x))
			System.out.println(x + " is positive infinite number");
		else if(negINF.isNegINF(x))
			System.out.println(x + " is negative infinite number");
		else 
			System.out.println(x + " isn't infinite number");
		return posINF.isPosINF(x) || negINF.isNegINF(x);
	}
}

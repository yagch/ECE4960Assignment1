package signedZero;

public class Test {
	SignedZero posZero = new SignedZero(1);
	SignedZero negZero = new SignedZero(-1);
	public void operat() {
		System.out.println("log(+0) = " + Math.log(posZero.val()));
		System.out.println("sin(+0)/(+0) = " + (Math.sin(posZero.val()) / posZero.val()));
		System.out.println("log(-0) = " + Math.log(negZero.val()));
		System.out.println("sin(-0)/(-0) = " + (Math.sin(negZero.val()) / negZero.val()));
		System.out.println("sin(-0)/|-0| = " + (Math.sin(negZero.val()) / Math.abs(negZero.val())));
	}
	public void detect(double x) {
		if(posZero.isPosZero(x))
			System.out.println(x + " is positive zero");
		else if(negZero.isNegZero(x))
			System.out.println(x + " is negative zero");
		else
			System.out.println(x + " isn't zero");
	}
}

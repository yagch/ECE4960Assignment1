package helper;

/**The function to calculate power*/
public class Power {
	public double pow(double a, int b) {
		double res = 1;
		if (b == 0) {
			return 1;
		}
		else if (b > 0) {
			for (int i = 0; i < b; i++) {
				res *= a;
			}
		}
		else {
			for (int i = 0; i > b; i--) {
				res /= a;
			}
		}
		return res;
	}
}

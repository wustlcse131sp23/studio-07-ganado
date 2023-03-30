package studio7;

public class Fraction {
	int numerator;
	int denominator;
	public Fraction(int num , int den) {
		numerator = num;
		denominator = den;
		
	}
	public double fractionAdd(double num2 , double den2) {
		double fraction1;
		double fraction2;
		fraction1 = (double)numerator / denominator;
		fraction2 = num2 / den2;
		return fraction1 + fraction2;
		
	}
	public double fractionMultiply(double num2, double den2) {
		double fraction1;
		double fraction2;
		fraction1 = (double)numerator / denominator;
		fraction2 = num2 / den2;
		return fraction1 * fraction2;
		
	}
	public String fractionReciprocal() {
		return (denominator + "/" + numerator);
		
	}
	
	
	
	
	public double simplify() {
		
		return denominator;
		
		
	}

}

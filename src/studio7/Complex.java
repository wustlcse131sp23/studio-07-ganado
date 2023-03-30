package studio7;

public class Complex {

	double complexNumber;
	public Complex() {
		
	}
	public double complexNumber(double a, double bi) {
		 complexNumber = a + bi;
		return complexNumber;
		
	}
	public double sumComplexNumbers(double a2, double bi2) {
		double complexNumber2 = a2 + bi2;
		return complexNumber + complexNumber2;
		
	}
	public double productComplexNumbers(double a2, double bi2) {
		double complexNumber2 = a2 + bi2;
		return complexNumber * complexNumber2;
		
	}
	

}

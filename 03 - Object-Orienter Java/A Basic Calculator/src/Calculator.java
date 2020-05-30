public class Calculator {
	/*
	This is a very basic calculator.
	*/
	
	public Calculator() {}
	
	public int add(int number1, int number2) { return number1 + number2; }
	public int substract(int number1, int number2) { return number1 - number2; }
	public int multiply(int number1, int number2) { return number1 * number2; }
	public int floorDivide(int number1, int number2) { return number1 / number2; }
	public int modulate(int number1, int number2) { return number1 % number2; }
	public double divide(double number1, double number2) { return number1 % number2; }
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
	}
}
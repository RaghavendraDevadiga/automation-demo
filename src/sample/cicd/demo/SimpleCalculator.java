package sample.cicd.demo;

public class SimpleCalculator {
	public static void main(String[] args) {
		System.out.println("Entering into the Simple Calculator");
		int num1 = 4,num2=7;
		SimpleCalculator calculator = new SimpleCalculator();
		
		System.out.println("Sum of num1 "+ num1 + " num2 "+ num2 + " is:"+ calculator.add(num1,num2));
	}
	
	public int add(int num1,int num2){
		int sum = num1 + num2;
		return sum;
	}
	
	public int substract(int num1, int num2) {
		int difference= num1 - num2;
		reurn difference;
	}
}

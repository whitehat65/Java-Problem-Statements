package arithmeticOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfTwoComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		List<Double> numbers=Arrays.stream(input.split(","))
				.map(Double::parseDouble)
				.collect(Collectors.toList());
		double rSum=numbers.get(0)+numbers.get(2);
		double lSum=numbers.get(1)+numbers.get(3);
		System.out.println(rSum+"+"+lSum+"i");
		sc.close();
	}

}

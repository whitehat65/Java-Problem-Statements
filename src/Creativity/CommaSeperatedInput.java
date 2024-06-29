package Creativity;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommaSeperatedInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		List<Integer> numbers=Arrays.stream(input.split(","))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int num1=numbers.get(0);
		int num2=numbers.get(1);
		sc.close();
	}

}

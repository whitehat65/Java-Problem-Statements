package arithmeticOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String address=sc.nextLine();
		List<String> addressLine = Arrays.stream(address.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
		int H=Integer.parseInt(addressLine.get(0));
		String S=addressLine.get(1);
		String C=addressLine.get(2);
		System.out.println("House Number : "+H+"\nStreet Name : "+S+"\nCity Name : "+C);
		sc.close();
	}
}
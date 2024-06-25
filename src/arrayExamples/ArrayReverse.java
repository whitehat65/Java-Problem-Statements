package arrayExamples;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] reversedArray=reverseArray(arr);
		for(int i=0;i<reversedArray.length;i++) {
			System.out.print(reversedArray[i]);
		}
		sc.close();		
	}
	public static int[] reverseArray(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}
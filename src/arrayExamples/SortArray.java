package arrayExamples;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ascendingArray=ascendingSort(arr);
		System.out.println("Asecnding Array");
		for(int i=0;i<ascendingArray.length;i++) {
			System.out.print(ascendingArray[i]+" ");
		}
		System.out.println();
		int[] descendingArray=descendingSort(arr);
		System.out.println("Descending Array");
		for(int i=0;i<descendingArray.length;i++) {
			System.out.print(descendingArray[i]+" ");
		}
		sc.close();
	}
	
	public static int[] ascendingSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static int[] descendingSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int maxIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[maxIndex]<arr[j]) {
					maxIndex=j;
				}
			}
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}	
}

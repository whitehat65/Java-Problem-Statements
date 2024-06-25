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
		int[] asendingArray=ascendingSort(arr);
		for(int i=0;i<asendingArray.length;i++) {
			System.out.print(asendingArray[i]+" ");
		}
		sc.close();
	}
	public static int[] ascendingSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
	}
}

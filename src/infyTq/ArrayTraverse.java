package infyTq;

public class ArrayTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6};
		usingForLoop(arr);
		usingWhileLoop(arr);
	}
	public static void usingForLoop(int[] arr) {
//		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+" ");
		}
	}
	public static void usingWhileLoop(int[] arr) {
		System.out.println("");
		int i=0;
		while(i!=arr.length) {
			System.out.print(i+" ");
			i++;
		}
	}
}
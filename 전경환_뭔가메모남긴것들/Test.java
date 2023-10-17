package test230703;

public class Test {
	public static void main(String[] args) {
		int[][] a = {{10,20,30},{20,30,15},{100,110,120}};
		int sum = 0;
//		System.out.println(a.length);
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
//				System.out.println(a[i].length);
//				int intnum = Integer.parseInt(a[i]) ;
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}
}

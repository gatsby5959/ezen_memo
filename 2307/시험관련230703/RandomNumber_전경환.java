package test230703;

import java.util.Scanner;

public class RandomNumber_전경환 {
	public static void main(String[] args) {
		System.out.print("난수의 개수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String strRandomfor = sc.next(); //반복횟수
		int int_randomfor = Integer.parseInt(strRandomfor);
		int sum = 0;
		for(int i = 0; i<int_randomfor; i++ ) {
			sum += (int)(Math.random()*99); //0~99사이
		}
	
		System.out.println("난수 "+ int_randomfor +"개의 합은 "+ sum );
		
	}
}

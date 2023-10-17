package test230703;

import Day13.Card;

public class CardPack2 {

	private Card2[] pack2 = new Card2[52]; // 52장의 Card2 가 들어갈 수 있는 배열
	private int cnt = 0; //번지를 넣는 개념.. 카드의 남는 개수 //카드가 52개가 있고 하나씩 빠질 때마다 숫자가 줄어들때 등 쓰는 수
	
	public CardPack2() {//기본생성자  // 얘가 for문으로 반복해서 카드를 모조리 1~13까지 다 넣어버린다.
		char shape = '♥';  //	'♥' '♣' '♠' '◆'
		for(int i=1; i<=4; i++) {
			switch (i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1; j<=13; j++) {
				Card2 c = new Card2();
				c.setShape(shape);
				c.setNum(j);
				pack2[cnt] = c;
				c.print();
				cnt++;
//				System.out.println();
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		CardPack2 c2 = new CardPack2();
		
	}
}

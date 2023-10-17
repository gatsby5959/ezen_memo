package test230703;

public class Card2 {

	private char shape; //모양
	private int num;	//숫자
	
	public Card2(){ // 생성자는 리턴을 날릴 필요가 없다.
		num = 0;
		shape = 'X';
	}
	
	//getter setter
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
		switch (shape) {
		case '♥':
		case '♣':
		case '♠':
		case '◆':
			this.shape = shape;
			break;
		default:
			this.shape = 'Y';
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
public void print() {
        
		System.out.print(shape);

        switch(num) {
        case 1 : System.out.print("A "); break; //11
        case 11 : System.out.print("J "); break; //11
        case 12 : System.out.print("Q "); break; //12
        case 13 : System.out.print("K "); break; //13
        default :
              System.out.print(num+" "); 
              }

	}
	
}

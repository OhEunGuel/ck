package net.hb.day08;

public class Car {
	//기본생성자 클래스이름동일, 생략가능함, void기술안함
	public Car(){ System.out.println("Car클래스 기본생성자");}
	
	public static void drive() {
	   System.out.println("static있는 drive메서드");
	   System.out.println("자동차는 무조건 drive()필수");
	}//end
	
	public static void stop() {
		System.out.println("static있는 stop메서드");
		System.out.println("자동차는 무조건 stop()필수");
	}//end
	
	public static void main(String[] args) {
		drive();  //static있는 메소든 기울기글자적용
		stop();   //static있는 메소든 기울기글자적용
	}//main end
	
}//Car class END






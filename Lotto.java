package net.hb.day08;

public class Lotto {
	public String book() {
		String title="몽블랑"; //local variable=지역변수
		return title; //메서드이름 book()도 몽블랑기억, return단독기술은 메세드탈출
		}//book end
	
    public double point() {
    		double save = 7.9;	//local variable=지역변수
    		return save ;		//메서드이름 point()도 7.9기억
    }//point end
    
	public void note() {
		System.out.println("note메서드");
		System.out.println("제목 = " + book() );
		System.out.println("누적 = " + point() );
	}//note end
	
	public static void main(String[] args) {
		System.out.println("Lotto클래스 main메서드");
		
		
	}//main end
}//class END

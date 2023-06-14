package net.hb.day08;

import java.util.Scanner;
import java.lang.Exception;
import java.lang.System;
import java.lang.String;

public class Test13scgugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단처리 정수형
		int dan=1;
	try{	
		System.out.print("단입력>>> ");
		dan = sc.nextInt();
	}catch(Exception ex){  }
		
		System.out.println("\n\t*구구단출력*");
		for(int i=1; i<10; i++) {
		  System.out.println("\t" + dan + "*" + i + "="  + (dan*i) );
		}
		
		sc.close();
		
		
		System.out.println();
		System.out.println("호텔예약시스템");
		System.out.println("항고예약시스템");
		System.out.println("팩키지상품비고");
	}//main end
}//class END





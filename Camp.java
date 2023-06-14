package net.hb.day08;

import java.util.Scanner;

public class Camp {
	static boolean[] book = new boolean[5]; //전역배열
	static int sel=9, num=0; //전역변수
	static Scanner sc = new Scanner(System.in);  //전역객체
	static String message="";
	static boolean flag=false;
	 
	public Camp() {
		System.out.println("*** 생성자 Camp.java 제자신라 호텔 프로그램입니다 ***");	
	}//기본생성자 end
		
	public static void reservation() { 
		  System.out.print("  예약캠프장 번호 입력 >>> ");
	      num = Integer.parseInt(sc.nextLine()); 
	      if(book[num-1]==false) {
	    	  System.out.println("  book["+num+"] 캠프장 예약성공\n" );  
	    	  book[num-1]=true; 
	      }else{
	    	 System.out.println("  이미 예약된 캠프장이라서 예약불가\n" ); 
	      }	
	}//end
	
	public static void cancel() {
		  System.out.print("  퇴실캠프장 번호 입력 >>> ");
	      num = Integer.parseInt(sc.nextLine()); //4번캠프장 퇴실
	      if( book[num-1]==true) {
	    	 System.out.println("  book["+num+"] 캠프장 퇴실성공\n" );
	    	 book[num-1]=false; //빈방상태로 만듬
	      }else{ 
	    	 System.out.println("  book["+num+"] 캠프장 비어있습니다\n"  ); 
	      }	
	}//end
	
	public static void  list() {
		  for(int i=0; i<book.length; i++){
	  		  if(book[i]==true) {
	  		    System.out.println( " " + (i+1) + "번째 ■캠프장 사용중" );
	  		  }else if(book[i]==false){
	  			System.out.println( " " + (i+1) + "번째 □캠프장 예약가능 "  );  
	  		  }
	  	   }//i end	
	}//end
	
	public static int  menu() {
		int my=1; //지역변수
		return my;
	}//end
	
	public static void myexit() {
		
	}//end
	
	public static void main(String[] args) { 
	  System.out.println("*** Camp.java 제주신라 호텔 프로그램입니다 ***");  
  	  list(); //함수호출
		
  	
  	  while(true) {
  		 try{
  			 System.out.println();
  			 System.out.println("1.예약  2.퇴실  3.list  9.종료(필수) ");
  			 System.out.print("서비스 번호를 선택하세요>>> ");
  			 sel = Integer.parseInt(sc.nextLine());
  			 	  
  			 switch(sel) { 
  			    case 1: //입실예약
  			      reservation();
  			      list(); 
  				  break;
  				
  			    case 2: //퇴실처리 
  			      cancel();
  			      list(); 
  			      break;
  			      
  			    case 3:
  			  	   list(); //함수호출
  			      break;
  			    	  
  			    default:
  			    	break;
  			 }//switch end
  			 
  			 if(sel==9) {
   				System.out.println("예약프로그램을 종료합니다");
   				break;
   			 }
  		 }catch(Exception ex){  }	
  	  }//while end
  	  
  	  sc.close();
	}//main end
}//Camp class END














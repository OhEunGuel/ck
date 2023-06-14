package net.hb.day08;

import java.util.Scanner;

public class Test11camp {
	public static void main(String[] args) {
		//static 키워드 생략 문법에러없음          
	  //자바에서 타입[]  배열이름 ~~~  
      //자바에서 배열길이 배열이름.length
	  //모든컴퓨터언어에서 배열첨자시작 [0] 
	  //배열new연산자로 선언하면자동초기화 int 0, double 0.0  boolean false String null
      //단점 배열은 같은타입으로 구성, 크기고정
	  //switch제어문 if문장으로 변경하세요 
 
	  System.out.println("*** Test11camp.java 워커힐 호텔 프로그램입니다 ***");	  
  	  boolean[] book = new boolean[5]; //배열은 자동으로 초기화 false
  	  for(int i=0; i<book.length; i++){
  		  if(book[i]==true) {
  		    System.out.println( " " + (i+1) + "번째 ■캠프장 사용중" );
  		  }else if(book[i]==false){
  			System.out.println( " " + (i+1) + "번째 □캠프장 예약가능 "  );  
  		  }
  	   }
		
  	  int sel=9, num=0;//coffee선택비슷
  	  Scanner sc = new Scanner(System.in);
  	  while(true) {
  		 try{
  			 System.out.println();
  			 System.out.println("1.예약  2.퇴실  3.list  9.종료(필수) ");
  			 System.out.print("서비스 번호를 선택하세요>>> ");
  			 sel = Integer.parseInt(sc.nextLine());
  			 
  			  
  			 switch(sel) { //switch제어문대신 if~elseif~else변경해서 작업 
  			    case 1: //예약입실 29번메뉴선택  문장에서 1.예약
  			      System.out.print("  예약캠프장 번호 입력 >>> ");
  			      num = Integer.parseInt(sc.nextLine()); //3번캠프장선택 
  			      if(book[num-1]==false) {
  			    	  System.out.println("  book["+num+"] 캠프장 예약성공\n" );  
  			    	  book[num-1]=true; //생략하면 예약확인여부 표시안됨 
  			      }else{
  			    	 System.out.println("  이미 예약된 캠프장이라서 예약불가\n" ); 
  			      }
  				  break;
  				
  			    case 2: //퇴실 
  			      //예약에서 3,5예약함
  			      System.out.print("  퇴실캠프장 번호 입력 >>> ");
  			      num = Integer.parseInt(sc.nextLine()); //4번캠프장 퇴실
  			      if( book[num-1]==true) {
  			    	 System.out.println("  book["+num+"] 캠프장 퇴실성공\n" );
  			    	 book[num-1]=false; //빈방상태로 만듬
  			      }else{ 
  			    	 System.out.println("  book["+num+"] 캠프장 비어있습니다\n"  ); 
  			      }
  			      break;
  			      
  			    case 3:
  			  	  for(int i=0; i<book.length; i++) {
  			  		  if(book[i]==true) {
  			  		    System.out.println( " " + (i+1) + "번째 ■캠프장 사용중" );
  			  		  }else if(book[i]==false){
  			  			System.out.println( " " + (i+1) + "번째 □캠프장 예약가능 "  );  
  			  		  }
  			  	  }	
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
}//class END














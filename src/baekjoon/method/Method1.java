package baekjoon.method;

import java.util.Scanner;

public class Method1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void timeAlarm() {
		
		while(true) {
			
			System.out.print("시를 입력하세요 : ");
			int hour = sc.nextInt();
			
			System.out.println("분을 입력하세요 : ");
			int minute = sc.nextInt();
			
			int newMin = 0; // 뺄 수가 45보다 작을 떄 60 - 45가 될 그릇
			int alarmHour = 0; // 입력한 시간에서 -1이 될 시간
			int alarmMin = 0; // 입력한 분과 newMin의 분을 더한 분
			
			if((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)) {
				if(minute < 45) { // 입력한 분이 45보다 작은 경우
					alarmHour = hour - 1;
					newMin = 60 - 45;
					alarmMin = minute + newMin;
				}else if(minute >= 45) { // 입력한 분이 45보다 크거나 같은 경우
					alarmHour = hour;
					alarmMin = minute - 45;
				}
				
				System.out.println(alarmHour + " : " + alarmMin);
				break;
			}else {
				System.out.println("시는 23을 넘길 수 없고 분은 59를 넘길 수 없습니다.");
			}
			
		}
		
	}
	
	public void multiplication() {
		
		while(true) {
			System.out.print("첫번째 수를 입력하세요 : ");
			int firstNum = sc.nextInt();
			
			System.out.print("두번쨰 수를 입력하세요 : ");
			int secondNum = sc.nextInt();
			
			System.out.println(firstNum * (secondNum % (secondNum / 10))); // 두번째 숫자의 일의 자리  ex) 456 % 45 
			System.out.println(firstNum * (secondNum / 10 % 10)); // 두번째 숫자의 십의 자리 ex) 456 / 10 % 10
			System.out.println(firstNum * (secondNum / 100)); // 두번째 숫자의 100의 자리
			System.out.println(firstNum * secondNum);
		}
		
	}
	
	public void chaseCount() {
		int totalCnt = 16;
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int knight = 2;
		int pon = 8;
		
		int kingResult = 0;
		int queenResult = 0;
		int lookResult = 0;
		int bishopResult = 0;
		int knightResult = 0;
		int ponResult = 0;
		
		while(true) {
			
			System.out.println("킹이 필요한 개수 : ");
			int needKing = sc.nextInt();
			
			if(needKing >= 0 && needKing <= 10) {
				if(king > needKing) {
					kingResult = king - needKing;
				}else if(king < needKing) {
					kingResult = -(needKing - king);
				}else {
					kingResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			System.out.println("퀸이 필요한 개수 : ");
			int needQueen = sc.nextInt();
			
			if(needQueen >= 0 && needQueen <= 10) {
				if(queen > needQueen) {
					queenResult = queen - needQueen;
				}else if(queen < needQueen) {
					queenResult = -(needQueen - queen);
				}else {
					queenResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			System.out.println("룩이 필요한 개수 : ");
			int needLook = sc.nextInt();
			
			if(needLook >= 0 && needLook <= 10) {
				if(look > needLook) {
					lookResult = look - needLook;
				}else if(look < needLook) {
					lookResult = -(needLook - look);
				}else {
					lookResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			System.out.println("비숍이 필요한 개수 : ");
			int needBishop = sc.nextInt();
			
			if(needBishop >= 0 && needBishop <= 10) {
				if(bishop > needBishop) {
					bishopResult = bishop - needBishop;
				}else if(bishop < needBishop) {
					bishopResult = -(needBishop - bishop);
				}else {
					bishopResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			System.out.println("나이트가 필요한 개수 : ");
			int needKnight = sc.nextInt();
			
			if(needKnight >= 0 && needKnight <= 10) {
				if(knight > needKnight) {
					knightResult = knight - needKnight;
				}else if(knight < needKnight) {
					knightResult = -(needKnight - knight);
				}else {
					knightResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			System.out.println("폰이 필요한 개수 : ");
			int needPon = sc.nextInt();
			
			if(needPon >= 0 && needPon <= 10) {
				if(pon > needPon) {
					ponResult = pon - needPon;
				}else if(pon < needPon) {
					ponResult = -(needPon- pon);
				}else {
					ponResult = 0;
				}
			}else {
				System.out.println("0~10까지의 숫자를 입력하세요");
				continue;
			}
			
			
			System.out.println("킹의 갯수 : " + kingResult);
			System.out.println("퀸의 갯수 : " + queenResult);
			System.out.println("룩의 갯수 : " + lookResult);
			System.out.println("비숍의 갯수 : " + bishopResult);
			System.out.println("나이트의 갯수 : " + knightResult);
			System.out.println("폰의 갯수 : " + ponResult);
			break;
		}

	}
	
	public void operation() {
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int result = sc.nextInt();
		
		System.out.println("두번째 값을 입력하세요 : ");
		int result2 = sc.nextInt();
		
		if(result >= 1 && result2 <= 10000) {
			
			System.out.println(result + result2);
			System.out.println(result - result2);
			System.out.println(result * result2);
			System.out.println(result / result2);
			System.out.println(result % result2);
		}
	}
	
	public void idCheck() {
	      String firstId = "joonas";
	      
	      while(true) {
	         System.out.println("아이디를 입력하세요 : ");
	         String insertId = sc.next();
	         int num = 0;
	         if(insertId.length() <= 50) {
	            for(int i = 0; i < insertId.length(); i++) {
	            
	               int check = (int)insertId.charAt(i);
	               if(check >= 97 && check <= 122) {
	            	   num++;
	            	  if(num == insertId.length()) {
	            		  if(firstId.equals(insertId)) {
	 	                     System.out.println(insertId + "??!");
	 	                     break;
	 	                  }else {
	 	                     System.out.println(insertId + "는 사용가능한 아이디 입니다.");
	 	                     return;
	 	                  }
	            	  }
	                  
	               }else {
	                  System.out.println("영어 소문자만 입력이 가능합니다.");
	                  break; // for문을 멈추는 브레이크
	               }
	            }
	         }else {
	            System.out.println("50글자를 넘어갈 수 없습니다.");
	         }
	      }
	      
	   }
	
	public void yearOperation() {
		
		while(true) {
			System.out.println("년도를 입력하세요");
			int year = sc.nextInt();
			
			if(year >= 1000 && year <= 3000) {
				System.out.println("서기 연도는 " + (year-543) + "년 입니다.");
			}else {
				System.out.println("1000~3000안의 숫자를 입력하세요");
			}
		}
		
	}

}

















package baekjoon.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Method2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void yooSung() {
		
		System.out.println("정유진");
		
	}
	
	 public void randomNum() {
		 Random ran = new Random();
		 
		 for(int i = 0; i < 8; i++) {
			 int ranNum = ran.nextInt(3)+1;
			 if(ranNum == 1) {
				 System.out.println("1");
			 }else if(ranNum == 2) {
				 System.out.println("2");
			 }else {
				 System.out.println("3");
			 }
		 }
		 
	 }
	
	public int[] solution(int n) {
        int[] answer = new int[n];
     
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[i] = i;
            }
        }

        return answer;
    }
	
	public void remainder() {
		int arr[] = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "번째 숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 1 && num < 1000) {
				arr[i] = num % 42;
				System.out.println(arr[i]);
				
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						cnt++;
						if(cnt >= 9) {
							cnt = 9;
							break;
						}
					}
				}
			}
			
		}
		System.out.println("답 : " + (10-cnt));
		System.out.println("same 배열 길이 : " + list.size());
		
		
	}
	
	public void test() {
		String name = "aabaabab";
		int num = 0;
		int sum = 0;
		for(int i = 0; i < name.length(); i++) {
			char ab = name.charAt(i);
			System.out.println(ab);
			if(ab == 'a') {
				sum += i;
			}else {
				sum += 0;
				
			}
			
		}
		System.out.println("총 합 : " + sum);
	}
	
	public void oxQuiz() {
		
		while(true) {
			
			System.out.print("테스트 케이스 값을 입력하세요 : ");
			int num = sc.nextInt();
			int sum = 0;
			int cnt = 0;
			for(int i = 0; i < num; i++) {
				System.out.print("ox를 1~80개이상 입력하세요 : ");
				String oxSet = sc.next();
				char oxArr[] = new char[oxSet.length()];
				if(oxSet.length() >= 1 && oxSet.length() <= 80) {
					for(int j = 0; j < oxSet.length(); j++) {
						oxArr[j] = oxSet.charAt(j);
						System.out.println(oxArr[j]);
					}
					
					for(int k = 0; k < oxArr.length; k++) {
						if(oxArr[k] == 'o') {
							cnt++;
						}else {
							cnt = 0;
						}
						sum += cnt;
					}
					
				}else {
					System.out.println("입력갑의 범위를 넘어섰습니다.");
				}
			}
			System.out.println("점수는 " + sum + "점입니다.");
		}
		
	}
	
	public void averageOver() {
		
		while(true) {
			System.out.print("테스트 케이스 수를 입력하세요 : ");
			int num = sc.nextInt();
			
			int total = 0;
			int avg = 0;
			int cnt = 0;
			float percent = 0;
			if(num >= 1 && num <= 10) {
				for(int i = 0; i < num; i++) {
					System.out.print("학생의 수를 입력하세요 : ");
					int student = sc.nextInt();
					int score[] = new int[student];
					if(student >= 1 && student <= 1000) {
						for(int j = 0; j < student; j++) {
							System.out.print("학생 " + (j+1) + "의 점수를 입력하세요 : ");
							score[j] = sc.nextInt();
							total += score[j];
							avg = total/student;
							
							}
						for(int k = 0; k < student; k++) {
							if(avg < score[k]) {
								cnt++;
							}
						}
						
					}else {
						System.out.println("1~1000까지의 숫자를 입력하세요.");
					}
					percent = ((float)cnt / student) * 100;
				}
				System.out.println("총 점수 : " + total);
				System.out.println("평균 : " + avg);
				System.out.println("평균이 넘는 사람 수 : " + cnt);
				System.out.printf("비율 : %.3f", percent);
				break;
			}else {
				System.out.println("1~10까지의 숫자를 입력하세요!");
			}
		}
		
	}
	
	public void dice() {
		Random r = new Random();
		int arr[] = new int[3]; // 랜덤 숫자를 담을 배열
		
		int cnt = 0;
		int total = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = r.nextInt(6) + 1; // 랜덤 숫자를 담는 변수
			System.out.print(arr[i] + " ");
			
			// 중복 체크하고 개수 확인
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					cnt++;
				}
			}
			
			if(cnt == 3) { // 중복된 숫자가 3개일때
				total = 10000 + arr[0] * 1000; // 그냥 아무거나 꺼내서 계산하기
			}else if(cnt == 1) { // 중복된 숫자가 두개일때
				
				// 중복체크후 중복된 숫자 추룰하여 계산사기
				for(int h = 0; h < i; h++) {
					if(arr[i] == arr[h]) {
						total = 1000 + arr[h] * 100;
					}
					
				}
				
			}else { // 중복된 값이 없을 때
				int num = arr[0];
				// 최대값 알고리즘
				for(int k = 0; k < arr.length; k++) {
					if(arr[k] > num) {
						num = arr[k];
						
					}
				}
				total = num * 100;
			}
		}
		System.out.println();
		System.out.println(cnt);
		System.out.println(total);
	}
		
	
	public void reciept() {
		
		while(true) {
			System.out.println("총 금액을 입력하세요 : ");
			int totalPrice = sc.nextInt();
			
			System.out.println("물건 종류의 개수 입력하세요 : ");
			int kindCnt = sc.nextInt();
			
			int total = 0;
			
			if(totalPrice >= 1 && totalPrice <= 100000000) {
				if(kindCnt >= 1 && kindCnt <= 100) {
					for(int i = 0; i < kindCnt; i++) {
						System.out.println("제품의 가격을 입력하세요 : ");
						int price = sc.nextInt();
						if(price >= 1 && price <= 1000000) {
							System.out.println("제품의 개수를 입력하세요 : ");
							int productCnt = sc.nextInt();
							total += price * productCnt;
						}
					}
				}
				System.out.println("총 가걱 : " + total);
				if(totalPrice == total) {
					System.out.println("가격이 일치합니다");
					break;
				}else {
					System.out.println("입력한 가격 : " + totalPrice);
					System.out.println("가격이 일치하지 않습니다.");
				}
			}else {
				System.out.println("가격의 범위를 넘어섰습니다.");
			}
		}
		
	}
	
	public void star1() {

			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("*");
			}

	}
	
	public void star2() {
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int k = num-1; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println("*");
		}
		
	}

}






















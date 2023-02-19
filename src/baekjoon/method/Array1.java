package baekjoon.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1 {
	
	public void array1() {
		int[] arr = new int[3]; // 길이가 3딘 정수형 배열
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		// 랜덤객체
		Random ran = new Random();
		// 랜덤으로 나온 숫자를 담을 배열
		int[] lotto = new int[6];
		
		int[] myLotto = new int[6];
		
		for(int k = 0; k < myLotto.length; k++) {
			System.out.print((k+1) + "번째 로또 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 45 || num <= 0) {
				System.out.println("1~45까지의 숫자를 입력하세요..");
				continue;
			}else {
				myLotto[k] = num;
				for(int i = 0; i < k; i++) {
					if(myLotto[i] == myLotto[k]) {
						System.out.println("숫자가 중복되었습니다.");
						k--;
						continue;
					}
				}
			}
		}
		
		System.out.println("======== 내 로또 번호 ==========");
		
		for(int h = 0; h < myLotto.length; h++) {
			System.out.print(myLotto[h] + " ");
		}
		
		System.out.println();
		
		// 로또 번호 코드
		for(int i = 0; i < lotto.length; i++) {
			int r = ran.nextInt(6) + 1;
			//System.out.print(r + " ");
			
			lotto[i] = r;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		Arrays.sort(lotto);
		Arrays.sort(myLotto);
		
		int cnt = 0;
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] == myLotto[i]) {
				cnt++;
			}
		}
		
		System.out.println("총 맞은 개수 : " + cnt);

	}
	
	public void manCoding() {
		
	}
	
}




























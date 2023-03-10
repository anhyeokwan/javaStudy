package baekjoon.method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmers {
	
	public int solution() {
		int answer = 0;
		
		String[] arr = {"aya", "ye", "woo", "ma"};
		
		// System.out.println(arr.length);
		
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
		// 해당 문자열이 있으면 문자열을 1로 바꾼다.
		// 1로된 부분은 모두 공백으로 바꾼다.
		// 배열을 검사해서 인덱스에 공백이 있으면 answer을 1씩 더해준다.
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replace("aya", "1");
			babbling[i] = babbling[i].replace("ye", "1");
			babbling[i] = babbling[i].replace("woo", "1");
			babbling[i] = babbling[i].replace("ma", "1");
			babbling[i] = babbling[i].replace("1", "");
			if(babbling[i].isEmpty()) {
				answer++;
			}
		}
		return answer;
	}
	
	public int solution2() {
		int answer = 0;
		
		int[] arr = {2,4,8};
		
		if((arr[1] - arr[0]) == (arr[2] - arr[1])) {
			answer = arr[arr.length-1] + (arr[1] - arr[0]);
		}else {
			answer = arr[arr.length-1] * (arr[1] / arr[0]);
		}
		
		return answer;
	}
	
	public int[] solution3(int num, int total) {
		int[] answer = new int[num];
		
		int sum = num * (num + 1) / 2;
		
		int check = ((total - sum) / num) + 1;
		for(int i = 0; i < num; i++) {
			answer[i] = check + i;
		}
		
		return answer;
	}
	
	public int solution4(int a, int b) {
		int answer = a * b -1;
		
		return answer;
	}
	
	public int solution5(String a, String b) {
		int answer = 0;
		
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		
		if(a.length() != b.length()) {
			System.out.println("문자열의 길이가 맞지 않습니다.");
		}else {
			System.out.println(Arrays.toString(aArr));
//			System.out.println(Arrays.toString(bArr));
//			한칸씩 미는 알고리즘
//			int dataLen = aArr.length;
//			char temp = aArr[0];
//			aArr[0] = aArr[dataLen-1];
//			
//			for(int i = dataLen-2; i >= 0; i--) {
//				aArr[i+1] = aArr[i];
//			}
//			aArr[1] = temp;
//			System.out.println(Arrays.toString(aArr));
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 3; i++) {
				sb.append(b);
			}
			System.out.println(sb.toString());
			answer = sb.indexOf(a);
		}
		
		return answer;
	}
	
	public String[] solution6(String my_str, int n) {
		String[] answer;
		
		if(my_str.length() % n == 0) {
			answer = new String[my_str.length()/n];
		}else {
			answer = new String[(my_str.length()/n) + 1];
		}
		
		// "," 넣기
		StringBuffer sb = new StringBuffer();
		sb.append(my_str);
		for(int i = 0; i < my_str.length()/n; i++) {
			sb.insert(n + (i*(n+1)), ",");
		}
		
		System.out.println(sb.toString());
		// 배열 문자열로 바꾸기
		String data = sb.toString();
		System.out.println("data : " + data);
		
		// ","를 기준으로 자르기
		String[] answer1 = data.split(",");
		for(int i = 0; i < answer1.length; i++) {
			answer[i] = answer1[i];
		}
		
		return answer;
	}
	
	public int solution7(int[] array) {
		int answer = 0;
		
		// 배열을 문자열로 바꿈
		String array1 = Arrays.toString(array);
		
		// ","를 기준으로 문자열을 다시 배열로 나눔
		String[] arr = array1.split(",");
		
		// 배열 요소를 다시 문자열로 더함
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array1.split(",").length; i++) {
			sb.append(arr[i]);
		}
		
		// 특정문자 개수 세는 코드
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '7') {
				answer++;
			}
		}
		
		return answer;
		
	}
	
	public String solution8(String my_String) {
		String answer = "";
		
		// 문자열을 소문자로 바꾸는 코드
		String small = my_String.toLowerCase();
		System.out.println("소문자로 바뀜?? : " + small);
		
		// 문자열의 길이만큼 배열
		int[] arr = new int[small.length()];
		
		// 배열에 문자열의 문자를 아스키코드로 변환해서 담기
		for(int i = 0; i < small.length(); i++) {
			System.out.println(small.charAt(i) + " : " + (int)small.charAt(i));
			arr[i] = (int)small.charAt(i);
		}
		
		// 배열 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 정렬된 배열을 다시 아스키코드로 변환해서 문자로 변환해서 문자열로 붙이기
		for(int i = 0; i < arr.length; i++) {
			answer += (char)arr[i];
		}
		
		return answer;
	}
	
	public int solution9(int n, int t) {
		int answer = 1;
		
		for(int i = 1; i <= t; i++) {
			answer = n * (i + n);
		}
		
		System.out.println((int)Math.pow(n, t));
		
		return answer;
	}
	
}






























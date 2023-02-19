package baekjoon.method;

public class Overloading {
	
	public int overloadingOne() {
		return 1;
	}
	
	public int overloadingOne(int a, int b) {
		return a + b;
	}
	
//	// 오버로딩할 때 자료형이 이전 것과 같으면 같은 메서드라고 인식한다.
//	public int overloadingOne(int x, int y) {
//		return x + y;
//	}
	
	public String overloadingOne(int a, String b) {
		return b + a;
	}
	
	// 순서도 중요!!
	public String overloadingOne(String b, int a) {
		return b + a;
	}
	
	public String overloadingOne(String a, String b) {
		return a + b;
	}
	
	public static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String sum : args) {
			result += sum + delim;
		}
		
		return result;
	}
	
}



























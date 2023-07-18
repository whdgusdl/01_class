package Class_;

public class Method02 {

	public static void main(String[] args) {
		Method02 m = new Method02();
		
		int s = m.sum(25,36); // 호출
		System.out.println("합 = " +s);
		
		s = m.sua(25,36); // 호출
		System.out.println("차 = " +s);
		
		s = m.sub(25,36); // 호출
		System.out.println("곱 = " +s);
		
		double a = m.suc(25,36); // 호출
		// System.out.println("몫 = " +a);
		System.out.println("몫 = " +  String.format("%5.3f", a)); //스태틱 함수 format (자료형. 하고 들어옴)
	}
	public int sum( int a, int b) { // 구현
		return a+b;
	}
	public int sua( int a, int b) { // 구현
		return a-b;
	}
	public int sub( int a, int b) { // 구현
		return a*b;
	}
	public double suc( int a, int b) { // 구현
		return (double)a/ b; //강제 형 변환(Cast 연산)
	}
}

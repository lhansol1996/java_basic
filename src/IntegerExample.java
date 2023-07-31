class IntegerExample {
	public static void main(String[] args) {
		// 정수의 다양한 표기
		int num1 = 128; // 10진수 표기
		int num2 = 0b0101; // 2진수 표기
		int num3 = 011; // 8진수 표기
		int num4 = 0x10AB; // 16진수 표기

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		long balace = 111111111111L; // 숫자 뒤의 L 은 롱타입 숫자라고 지정해주는 것 (기본값이 int 라서)

		byte x = -128;
		// byte y = 128;

		//실수 표현
		float pi = 3.14F; // F는 float 값이라고 지정 (기본값은 double 이라서)
		double pi2 = 3.14;
	}
}

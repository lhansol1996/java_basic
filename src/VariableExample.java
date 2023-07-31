class VariableExample {
	public static void main(String[] args) {
		// 변수는 프로그램에서 사용하는 데이터를 저장하기 위한 메모리 공간이다.
		// 변수를 사용하는 목적은 데이터를 재사용하기 위함이다.

		// 변수 선언 : 변수종류 변수명;
		String name; //문자열 변수 String
		int age; // 정수 변수 int
		double weight; // 실수 변수 double
		
		// 변수 초기화, = 등호는 대입연산자
		name = "김종원"; // name이라는 변수에 "김종원" 이라는 값이 할당된 것
		age = 30;
		weight = 66.6;

		// 변수 사용
		System.out.println(name); // 화면에 김종원으로 출력됨.
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);

		// 변수의 값 수정(Update)
		name = "홍길동";
		age = 40;
		weight = 55.5;

		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);

		int age2;
		// 변수에 변수의 값을 할당.
		age2 = age;
		System.out.println(age2);

		// 변수 선언과 할당을 동시에
		int score = 95;
		System.out.println(score);

		// 동일타입의 변수 2개 이상을 동시에 선언, 할당
		int a1 = 10, a2 = 20, a3 = 30, a4 = 40, a5 = 50;
		/* int a1 = 10
		   int a2 = 20
		   int a3 = 30
		   int a4 = 40
		   int a5 = 50
		   와 같은 형태이다. */
		System.out.println(a5);

		// 초기화 되지 않은 변수는 사용할 수 없다.
		int x;
		// System.out.println(x); // 컴파일 에러 발생
		x = 100;

		// 변수명의 첫번째 글자는 문자, $, _ 만 가능
		// int 1a; // 컴파일 에러

		// 변수명은 대,소문자를 구분한다.
		// int x 와 int X 는 각각 다른 변수를 선언한 것.

		// 첫문자는 소문자이되, 다른 단어가 붙을 때는 붙은 단어의 첫글자를 대문자로
		// int firstName  카멜 표기법
		// first와 name의 합성어 이므로 뒷 단어인 Name의 첫 단어를 대문자로
		String firstName = "종원";
		char lastName = '김';
		System.out.println(lastName);

		// 자바 예약어(키워드)는 변수명로 사용할 수 없다.
		// boolean, class, switch, return 등등 현재 이 프로그램상에서 파란색으로 표기된 단어들
		// int this; // 컴파일 에러

		// 변수명으로 한글도 지정이 가능하다. 사용하지는 않음.
		String 이름 = "홍길동";
		System.out.println(이름);

		// 자바는 블록스코프다. {}안에서 선언된 변수는 {}안에서만 적용됨.
		/* if(true) {
			int t = 50 ;
			System.out.println(t);  if(){} 안에서 지정된 t 는 if(){} 안에서만 적용
		} */
		// System.out.println(t);  if(){} 밖에서는 적용 X

	}
}

/* literal (값) 개발자가 직접 코드에 입력하는 값 : 한번 작성하고 사용하면 사라짐.
이러한 값을 어떤 메모리에 저장해 놓고 사용하는 것을 변수라고 함 */

/* main() {
변수의종류(String_문자열, int_숫자, double_실수) 변수명; 으로 변수를 선언할 수 있다.
} */

/* 등호는 우측의 값을 왼쪽의 변수에 할당하라는 뜻. 변수 초기화라 함. */

/* 평소에 변수를 계속 선언하는 습관을 들여야 한다. */

/* 변수를 선언하면 하나의 값을 여러 곳에서 사용할 때, 해당 값이 바뀌게 되었을 때
변수 초기화 된 값만 바꾸면 해당 변수가 사용 된 모든 곳에 적용되어 편리하다. */

/* 선언만 된, 할당이 되지 않은 변수를 사용하려 하면 컴파일 에러가 발생 */


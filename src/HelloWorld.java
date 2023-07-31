class HelloWorld /* 클래스 선언부 */ {
	public static void main(String[] args) /* 실행문, 명령문 */ { /* 실행 진입점 중괄호 { 이후로 출력됨. */
		System.out.println("안녕하세요. 김종원입니다."); // 문자열은 ""
		System.out.println(30); // 숫자는 괄호만
		System.out.println(3.14); 
		System.out.println('남'); // 단일 문자는
		System.out.println(true); // 분리형은 true/false
	}
}

/* 컴파일_ javac 는 확장자 .java 포함해서
출력시에는_ java 는 확장자 포함하지 않고 */

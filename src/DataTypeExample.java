class DataTypeExample {
	public static void main(String[] args) {
		char ch1 = '가';
		char ch2 = 0xAC00; // 유니코드 '가'
		char ch3 = '\uAC00';
		// 역슬래시u 는 유니코드라고 표기해주는 것

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 이스케이프 문자 처리
		String message = "\"자바\"는 웹 애플리케이션 개발 최강 언어이다.";
		// '\' 이러한 문자를 회피문자라고 한다.
		System.out.println(message);
		
		String path = "C:\\a\\b\\c\\some.txt";
        System.out.println(path);
		
		// 제어문자
        String message2 = "안녕하세요.\n 김기정입니\b다.\r";
        System.out.println(message2);
        
        String header = "번호\t이름\t나이";
        System.out.println(header);
        // \n 줄바꿈, \t 줄띄움. 주로 사용.
        
        // boolean
        boolean isMan = true;
        // boolean flag = 0;  // 컴파일 에러
        System.out.println(isMan);
        
        // int, boolean, string 많이 사용.
	}
}

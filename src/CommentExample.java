class CommentExample {

    // 자바 프로그램의 실행 진입점 역할의 메소드 (엔트리 포인트)
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        System.out.println("주석 테스트테스트 입니다..."); // newline 단독라인에 출력
        // 커맨드창에 텍스트를 출력하는 방법이 3가지
        System.out.print("출력 후 라인 바꾸지 않음."); // 같은 줄에 출력
        System.out.print("출력 후 라인 바꾸지 않음.");
        System.out.print("출력 후 라인 바꾸지 않음.");

        /*
         * System.out.print("멀티라인 주석입니다."); 
         * System.out.print("멀티라인 주석입니다.");
         * System.out.print("멀티라인 주석입니다.");
         */

        System.out.printf("%s", "김종원입니다..."); // format 형식을 지정해서 출력
    }
}

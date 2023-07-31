/*
 * for 반복문
 */
public class ForExample {

    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            System.out.println("풀스택 웹 개발자 과정");
        }
        // System.out.println(index); // 컴파일 오류

        /*
         * int index; for (index = 0; index < 10; index++) {
         * System.out.println("풀스택 웹 개발자 과정"); } System.out.println(index); // 가능
         */
        // 위의 for 문의 index 값과 아래에 선언한 index 값은 다른 값이다.
        // 블록 스코프(범위) 이기 때문

        int result = 0;
        for (int index = 0; index <= 100; index++) {
            result += index;
        }
        System.out.println(result);

        // 중첩 for문을 이용한 사각형 출력
        for (int i = 0; i < 5; i++) {         // 행 반복
            for (int j = 0; j < 5; j++) {     // 열 반복
                System.out.print('*');
            }
            System.out.println();
            // println 에 아무값도 주지 않으면 줄만 바꾼다.
        }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // 중첩 for문을 활용한 구구단 출력
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}

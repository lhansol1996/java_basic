/*
 * 메소드(함수) 정의 및 사용
 */
public class MethodExample /* 클래스 선언부 */ {

    /*
     * 구구단을 출력하는 메소드 정의
     */
    static void printGugudan() /* 메소드 선언부 */ {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

    /*
     * 단을 입력받아 해당 단을 출력하는 기능
     */
    static void printDan(int dan) {
        // 매개변수 dan
        System.out.println(dan + "단");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "x" + i + "=" + (dan * i));
        }
        System.out.println();
    }

    /*
     * 두개의 정수를 전달 받아 해당 정수의 합을 반환하는 기능
     */
    static int sum(int x, int y) {
        // 반환타입 int
        // return;
        return x + y; // x+y 결과값을 호출한쪽으로 int형으로 반환해줌.
    }

    public static void main(String[] args) {
        System.out.println("구구단 출력하기");
        // 구구단 출력 메소드 사용(호출)
        printGugudan();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        printGugudan();
        printGugudan();

        // 구구단 5단을 출력
        printDan(5); // 5가 전달인자(Argument)

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        printDan(7);
        
        // x, y의 합을 호출
        int x = 500, y = 451234;
        int result = sum(x, y);
        System.out.println(result);
        
        System.out.println(sum(5, 10));
    }

}

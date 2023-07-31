/*
 * break 이동문
 */
public class BreakExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("출력 = " + i);
            if (i == 5) {
                break;
                // i 가 5일때 for문 작동을 멈춤.
            }
        }
    }

}

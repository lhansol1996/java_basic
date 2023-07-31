/*
 * return
 */
public class ReturnExample {

    public static void main(String[] args) {
        System.out.println("자바 프로그램 시작됨.");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // break;
                // continue;
                return; // method 자체를 끝내는 것.
            }
            System.out.println(i);
        }

        System.out.println("자바프로그램 종료됨.");
    } // method 내에 return 값이 있으면 이 지점으로 나가짐.

}

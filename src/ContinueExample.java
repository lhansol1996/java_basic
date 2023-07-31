/*
 * continue 이동문
 */
public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
                // i가 5일때에만 출력하지 않음.
            }
            System.out.println("출력 = " + i);
        }
        /* for (int i = 0; i < 10; i++) {
         *  if (i == 5) {
         *  } else {
         *      System.out.println("출력 = " + i);
         *      }
         *  }
         */
        
        // 1부터 100까지 홀수만 출력하시오
        // if문 이용
        for (int i = 1; i <= 100; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        // 변수에 대입하는 식을 바꿈
        for (int i = 1; i <= 100; i+=2) {
                System.out.println(i);
        }
        // continue 이용
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        
    }

}

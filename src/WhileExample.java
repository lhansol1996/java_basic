/*
 * 반복문 while
 */
public class WhileExample {

    public static void main(String[] args) {

        int index = 0;
        while (index < 5) {
            System.out.println("반복됩니다.");
            index++;
        }

        int result = 0;
        index = 1;
        while (index <= 100) {
            result += index;
            // result = result + index ;
            index++;
        }
        System.out.println("총합 : " + result);

        int oddSum = 0, oddIndex = 1, evenSum = 0, evenIndex = 0;
        while (oddIndex <= 100) {
            oddSum += oddIndex;
            oddIndex += 2;
        }
        while (evenIndex <= 100) {
            evenSum += evenIndex;
            evenIndex += 2;
        }
        System.out.println("홀수합 : " + oddSum);
        System.out.println("짝수합 : " + evenSum);

        oddSum = 0;
        evenSum = 0;
        result = 0;
        index = 1;
        while (index <= 100) {
            if ((index % 2) == 0) {
                evenSum += index;
            } else {
                oddSum += index;
            }
            index++;
        }
        System.out.println("홀수합 : " + oddSum);
        System.out.println("짝수합 : " + evenSum);

        // do ~ while 문
        index = 0;
        do {
            System.out.println("풀스택 웹 개발자 과정");
            index++;
        } while (index < 10);
        /*
         * do {} 안을 한번 실행하고 while () 의 조건을 확인함. 
         * 무조건 do {}의 구문이 한번은 실행 됨.
         */

    }
}

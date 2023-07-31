/*
 * 자바에서 지원하는 연산자들
 */
public class OperatorExample {

    public static void main(String[] args) {
        int x = 30, y = 5;

        // 산술연산자
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y); // 나머지 연산자

        // + 연산자는 오버로딩(중복정의)
        System.out.println(10 + 50);
        System.out.println("김기정" + "선생님");
        System.out.println(10 + "선생님");

        /*
         * 연산자는 피연산자들이 동일타입인 경우에만 연산이 된다. 
         * ex) int는 int끼리 만약 타입이 다르면 피연산자가 문자로 형변환 한다.
         */

        System.out.println(10 + 30 + "선생님"); // 40선생님
        // System.out.println("40" + "선생님"); 과 같음.

        System.out.println("선생님" + 10 + 30); // 선생님1030
        // System.out.println("선생님" + "10" + "30" ); 과 같음.

        System.out.println("선생님" + (10 + 30)); // 실제 수학처럼 ()안이 먼저 연산된다.
        System.out.println("합 = " + (10 + 30));

        // 위 처럼 연산은 순서대로 적용된다.

        // 복합대입연산자 (+=, -=, *=, /=, %=)
        // x = x + 5;
        x += 5; // 35

        x -= 5; // 30
        x *= 5; // 150
        x /= 5; // 30
        x %= 5; // 0
        System.out.println(x);

        x = 10;
        y = 5;
        // 비교 연산자 (==, !=, >, >=, <, <=, ......)
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);

        if (x > 5) {
            System.out.println(true);
        }

        // 증감 연산자 (++,--)
        /*
         *  x = x + 1;
         *  x += 1;
         */ 
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        x = 10;
        // System.out.println(x++); // 10 // x를 먼저 출력하고 ++를 해주는 상태
        System.out.println(++x); // 11

        x = 30;
        y = 50;
        // 논리 연산자 (&&, ||, !)
        System.out.println(x >= 30 && y <= 50); // && : and
        System.out.println(x < 30 && y <= 50);
        System.out.println(x < 30 || y <= 50); // || : or
        System.out.println(!(x > 30)); // ! : not

        // 조건삼항연산자
        int score = 85;
        String result = score >= 60 ? "통과" : "실패";
        // score가 60보다 크거나 같다 비교 후 true면 통과, false면 실패
        System.out.println(result);

        // 기본데이터타입 형변환

        // 자동형변환(Promotion - Up Casting)
        double some = 50; // 정수(4byte)인 50을 자동으로 실수(8byte)로 형변환하고 할당(=)한다.
        // double some = 50.0;

        // 강제형변환(Demotion - Down Casting)
        double avg = 85.34567;
        System.out.println(avg);
        System.out.println((int) avg); // 실수(8byte)인 avg 값을 정수(4byte)(int)타입으로 강제형변환하여 출력.

        int avg2 = (int) avg;
        System.out.println(avg2);
    }
}

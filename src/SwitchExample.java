/*
 * 조건(분기)문 switch
 */
public class SwitchExample {

    public static void main(String[] args) {
        
        int num = 1;
        switch (num) {
            case 1: System.out.println("1입니다..");
                break;
                // break : 제어문 중 이동문. 중괄호 {} 바깥으로 이동하시오 라는 뜻.
            case 2: System.out.println("2입니다..");
                break;
            case 3: System.out.println("3입니다..");
                break;
            case 4: System.out.println("4입니다..");
                break;
            case 5: System.out.println("5입니다..");
                break;
            default: System.out.println("일치하는 값이 없습니다.");
        }
        // 실수 double 타입은 불가능하다.
        
        char some = 'C';
        switch (some) {
            case 'A': System.out.println("A입니다..");
            break;
            case 'B': System.out.println("B입니다..");
            break;
            case 'C': System.out.println("C입니다..");
            break;
            case 'D': System.out.println("D입니다..");
            break;
            case 'E': System.out.println("E입니다..");
            break;
            default: System.out.println("일치하는 값이 없습니다.");
        }
        
        String name = "김기정";
        switch (name) {
            case "김기정": System.out.println("김기정 입니다..");
            break;
            case "박기정": System.out.println("박기정 입니다..");
            break;
            default: System.out.println("일치하는 값이 없습니다.");
        }
            
        int score = 88;
        switch (score/10) {
            case 10: ;
            case 9: System.out.println("수");
                break;
            case 8: System.out.println("우");
                break;
            case 7: System.out.println("미");
                break;
            case 6: System.out.println("양");
                break;
            default: System.out.println("가");
        }
        
        int x = 50, y = 30;
        char operatior = '+';
        switch (operatior) {
            case '+': System.out.println("합 =" + (x + y));
                break;
            case '-': System.out.println("합 =" + (x - y));
                break;
            case '*': System.out.println("합 =" + (x * y));
                break;
            case '/': System.out.println("합 =" + (x / y));
                break;
        }
    }
}

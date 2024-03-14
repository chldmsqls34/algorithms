package mathTest;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        String firstNum = sc.next();
        System.out.println("두번째 숫자를 입력하세요");
        String secondNum = sc.next();
        System.out.println("+, -, *, /를 입력하세요");
        String opcode = sc.next();
        int intFirstNum = Integer.parseInt(firstNum);
        int intSecondNum = Integer.parseInt(secondNum);
        int result = 0;
        switch (opcode){
            case "+" :
                result = intFirstNum + intSecondNum;
                break;
            case "-" :
                result = intFirstNum - intSecondNum;
                break;
            case "*" :
                result = intFirstNum * intSecondNum;
                break;
            case "/" :
                result = intFirstNum - intSecondNum;
                break;
            default:
                System.out.println("잘못된 연산기호입니다");
        }
//        if (opcode.equals("+")) {
//            result = intFirstNum + intSecondNum;
//        } else if (opcode.equals("-")) {
//            result = intFirstNum - intSecondNum;
//        } else if (opcode.equals("*")) {
//            result = intFirstNum * intSecondNum;
//        } else if (opcode.equals("/")) {
//            result = intFirstNum / intSecondNum;
//        } else {
//            System.out.println("잘못된 연산기호입니다");
//        }
        System.out.println("첫번째 값은 " + firstNum + "입니다");
        System.out.println("두번째 값은 " + secondNum + "입니다");
        System.out.println("연산결과는 " + result + "입니다");

    }
}

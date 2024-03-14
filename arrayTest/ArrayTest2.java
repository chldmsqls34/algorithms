package arrayTest;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험에 응시한 학생 수는 몇명입니까?");
        int studentNum = sc.nextInt();
        String[] names = new String[studentNum];
        int[] numbers = new int[studentNum];
        System.out.println("응시한 학생의 이름을 입력해주세요");
        for (int i = 0; i < names.length;i++){
            names[i] = sc.next();
        }
        System.out.println("학생들의 시험 점수를 입력해주세요");

        int max = 0;
        int sequence = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
                sequence = i;
            }
        }
        System.out.println("입력된 점수 중 1등은 "+names[sequence]+"이고 점수는" + max + "입니다");



    }
}

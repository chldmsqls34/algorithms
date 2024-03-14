package arrayTest;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
        int studentNum = sc.nextInt();
        int[] score1 = new int[studentNum];


        int avg = 0;
        for (int i = 0; i < score1.length; i++) {
            System.out.println("1반 학생들의 점수를 입력해주세요.");
            score1[i] = sc.nextInt();
            avg += score1[i];
        }
        System.out.println("1반 평균은 " + avg / studentNum + "이다");
        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
        int studentNum2 = sc.nextInt();
        int[] score2 = new int[studentNum2];

        int avg2 = 0;
        for (int i = 0; i < score2.length; i++) {
            System.out.println("2반 학생들의 점수를 입력해주세요.");
            score2[i] = sc.nextInt();
            avg2 += score2[i];
        }
        System.out.println("2반 평균은 " + avg2 / studentNum2 + "이다");
        int total = avg + avg2;
        int totalNum = studentNum + studentNum2;

        System.out.println("전체 평균은 " + total / totalNum + "이다");

    }
}

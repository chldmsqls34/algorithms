package gradeOOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        String name = sc.next();

        System.out.println("국어점수 : ");
        String kor = sc.next();

        System.out.println("영어점수 : ");
        String eng = sc.next();

        System.out.println("수학점수 : ");
        String math = sc.next();

        System.out.println("평균 점수를 구하시오");
        String avg = sc.next();



        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + name);
        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("평균 점수: " + avg);

    }
}
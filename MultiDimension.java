import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까? ");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까? ");
        int numberOfStudent2 = sc.nextInt();
        int[] scores = new int[numberOfStudent];

        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            //System.out.println(i + 1 + "점수를 입력: ");
            scores[i] = (int)(Math.random()*100);
            avg += scores[i];
        }

        System.out.println("1반의 평균 점수: " + (avg / numberOfStudent) + "이다");
        System.out.println("2반의 평균 점수: " + (avg / numberOfStudent2) + "이다");
    }
}


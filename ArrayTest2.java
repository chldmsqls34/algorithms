import java.util.Scanner;

public class ArrayTest2 {
    /**
     * 최적화 문제중 최대값 구하기
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");


        System.out.println("시험에 응시한 학생수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();
        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];

        System.out.println("응시한 학생의 이름을 입력하세요");
        int nameOfStudent = sc.nextInt();
        String[] name = new String[nameOfStudent];

        System.out.println("응시한 학생의 점수를 입력하세요");
        int scoreOfStudent = sc.nextInt();
        String[] score = new String[scoreOfStudent];

        
        int max = 0;
        for(int i = 0; i < scores.length; i++){
            System.out.println("자연수 입력: " );
            String num = sc.next();
            scores[i] = Integer.parseInt(num);
            if(max < scores[i]) {
                max = scores[i];
            }
        }
            System.out.println("입력된 값 중 최대값은"+max+"이다");
        }





    }
}

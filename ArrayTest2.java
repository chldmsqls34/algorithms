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
        int students = sc.nextInt();
        int[] score = new int[students];
        String[] stuname = new String[students];

        for(int i = 0; i < score.length; i++){
            System.out.println(i+1+"번째 학생 이름 " );
            stuname[i] = sc.next();
            System.out.println(i+1+"번째 학생 점수 ");
            score[i] = Integer.parseInt(sc.next());
        }
        int max = 0;
        String name = "";
        for(int i = 0; i < stuname.length; i++){
            if(score[i]>max){
                max = score[i];
                name = stuname[i];

            }
        }

        System.out.println("1등학생의 이름은"+name+"이고"+max+"이다");



    }
}

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
        int[] arr = new int[students];
        String[] arr1 = new String[students];

        for(int i = 0; i < arr.length; i++){
            System.out.println(i+1+"번째 학생 이름 " );
            arr1[i] = sc.next();
            System.out.println(i+1+"번째 학생 점수 ");
            arr[i] = Integer.parseInt(sc.next());
        }
        String name = "";
        int max = 0;
        int stunum = 0;
        for (int i = 0; i < students; i++){
            if (arr[i] > max){
                max =  arr[i];
                stunum = i+1;
                name = arr1[i];
            }
            System.out.println("1등 점수는"+stunum+"번쨰"+name+"학생의"+max+"점이다");
        }





    }
}

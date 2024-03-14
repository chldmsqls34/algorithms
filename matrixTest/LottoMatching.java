package matrixTest;
//1등 6개맞춤
//2등 5개맞춤
//3등 4개맞춤
//4등 3개맞춤
//꽝 2개이하
//1부터8까지 중복없는숫자 6개이다


import java.util.Arrays;


public class LottoMatching {
    public static void main(String[] args) {


        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = (int) (1 + Math.random() * 7);
            for (int j = 0; j < i; j++) {  /**중복숫자피하기**/
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(arr);

        System.out.println("당첨 숫자입니다");
        for (int i : arr) {
            System.out.print("[" + i + "]");
        }


        int[] arr2 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr2[i] = (int) (1 + Math.random() * 7);
            for (int j = 0; j < i; j++) {  /**중복숫자피하기**/
                if (arr2[i] == arr2[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(arr2);
        System.out.println("\n당신의 숫자입니다");
        for (int i : arr2) {
            System.out.print("[" + i + "]");
        }
        int count =0;
        for (int i = 0; i < 6; i++) {
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[i] == arr2[j]) {
                    check = true;
                }
            }
            if (check == true) {
                count++;
            }
        }
        System.out.println("");
        switch (count){
            case 6 :
                System.out.println("1등입니다");
                break;
            case 5 :
                System.out.println("2등입니다");
                break;
            case 4 :
                System.out.println("3등입니다");
                break;
            case 3:
                System.out.println("4등입니다");
                break;
            default:
                System.out.println("꽝입니다");
                break;
        }

    }
}



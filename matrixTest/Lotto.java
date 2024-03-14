package matrixTest;

import java.util.Arrays;

public class Lotto {

    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = (int) (1+Math.random() * 44);
            for (int j = 0; j < i; j++) {  /**중복숫자피하기**/
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
//        for (int i = 0; i < 6; i++) { // 배열 오름차순 정렬(버블정렬)
//            for (int j = 0; j < 5; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print("[" + i + "]");
        }

    }
}
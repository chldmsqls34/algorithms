package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int total =0;
        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr);
        loop:
        for(int i =0; i<9;i++){
            for(int j = i+1;j<9;j++){
                if(total - arr[i]-arr[j] == 100){
                    for(int k=0;k<9;k++){
                        if(k!=i && k!=j){
                            System.out.println(arr[k]);
                        }
                    }
                    break loop;
                }
            }
        }
    }
}

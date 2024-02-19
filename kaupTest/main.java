package kaupTest;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("카우프 지수 구하는 프로그램을 구하시오 ");
        //키 150 이상 200 미만 / 몸무게 30 이상 130 미만

        double tall = ((int) (Math.random() * 49) + 150);
        System.out.printf("키: %f", tall);
        System.out.println();

        double weight = ((int) (Math.random() * 100) + 30);
        System.out.printf("몸무게: %f", weight);
        System.out.println();

        double bmi = weight / (tall / 100) * (tall / 100);
        System.out.println("bmi: " + bmi);
        }

    }
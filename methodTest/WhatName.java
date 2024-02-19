package methodTest;

import java.util.Scanner;

public class WhatName {
    static String inputname(Scanner sc) {
        System.out.println("학생 이름:");
        return sc.next();
    }

    {
        Scanner sc = new Scanner(System.in);
        String name = inputname(sc);
        System.out.println("이름: " + name);

    }

}

package com.example.java;

import java.util.Scanner;

public class D_scanner_print {

    public static void main(String[] args) {

        String name = "홍길동";
        System.out.printf("이름 : %s\n", name);

        int age = 25;
        System.out.printf("나이 : %d\n", age);

        System.out.printf("[자기소개]\n안녕하세요!\n만나서 반갑습니다.\n");

        System.out.println("당신의 이름은?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.printf("제 이름은 %s입니다.\n", userName);

        System.out.println("그럼 나이는 어떻게 되나요?");
        int userAge = sc.nextInt();
        System.out.printf("제 나이는 %d살 입니다\n", userAge);

    }

}

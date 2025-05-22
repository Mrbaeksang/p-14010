package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.println("명령)");

            String command = sc.nextLine();

            switch (command) {
                case "등록":
                    System.out.println("명언을 입력하세요: ");
                    String speak = sc.nextLine();
                    System.out.println("작가를 입력하세요: ");
                    String author = sc.nextLine();
                    System.out.println("등록되었습니다 !");
                    System.out.println("명언 : " + speak);
                    System.out.println("작가 : " + author);
                    break;
                case "종료":
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 명령어가 아닙니다.");
            }


        }
    }
}

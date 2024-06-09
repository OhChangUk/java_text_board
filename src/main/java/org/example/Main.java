package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("자바 텍스트 게시판 시작");
    Scanner sc = new Scanner(System.in);

    while(true){
      String cmd = sc.nextLine();
      if(cmd.equals("exit")){
        break;
      }

      System.out.printf("입력받은 명령어 : %s\n", cmd);
    }
  }
}
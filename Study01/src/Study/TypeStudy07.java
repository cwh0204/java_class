/*if else if 다중 조건식 형식)
 * if(조건식1){
 * 조건식 1이 참일 때 실행;
 * }else if(조건식2){
 * 조건식 2가 참일 때 실행;
 * }else{
 * 조건식 1, 2 모두 거짓일 때 실행;
 * }
 */

import java.util.Scanner;

public class TypeStudy07 {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      System.out.print("-100부터 100사이의 정수 숫자만 입력>>");
      
      int a = Integer.parseInt(scan.nextLine());
      if(a>=-100 && a<=100) {
      }else {
         System.out.println("-100 부터 100사이의 정수 숫자만 입력하세요!");
      }
   }
}

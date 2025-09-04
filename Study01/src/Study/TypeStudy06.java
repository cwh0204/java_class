/*
 * if조건문 형식)
 *  if(조건식){
 *  조건식이 참이면 실행;
 *  }
 *  
 *  
 *  if~else 조건문 형식)
 *  if(조건식) {   
 *  조건식이 참이면 실행
 *  }else{
 *  조건식이 거짓이면 실행;
 *  }
 */

import java.util.Scanner;

public class TypeStudy06 {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      /*
       * 1.System.in은 키보드 입력장치와 연결
       * 2.new 키워드로 새로운 객체명 scan생성
       */
      System.out.println("##### 1부터 100사이 정수 숫자만 입력 >>");
      int number = Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 변경
      
      if(!(number >=1 && number <= 100)) {
         System.out.println("1부터 100사이의 정수만 입력하세요!");//-->유효성 검증 메시지 자바 벨러데이션
      }else {
         
         if(number%2 ==0) {
            System.out.println(number+"는 짝수 입니다!");
         }
         
         if(!(number %2 == 0)) {//number%2 == 과 같은 조건이다.
            System.out.println(number + "는 홀수 입니다.");
         }
         
         
      }//outer if else
      
   }
}

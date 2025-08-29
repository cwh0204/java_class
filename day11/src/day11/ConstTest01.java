package day11;
/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : 생성자를 이용한 객체 복사 예제소스)
 */
class Car01{
   String color;//차 색상
   String gearType;//변속기 종류(auto, 수동)
   int door;//차문개수
   /*클래스 소속 멤버변수를 명시적 코드로 초기화를 하지 않으면 자바는 다음과 같은 기본값으로 초기화를 한다.
    *참조 즉 레퍼런스 타임 : null, boolean 타임 : false
    *byte, short, int : 0,long,0L
    *float : 0.0f , double : 0.0 or 0.0d
    */
   Car01(){
      this("white", "auto", 4);//같은 클래스내의 전달인자 3개짜리 오버로딩 된 다른 생성자를 호출
      }
   
   Car01(Car01 c){//생성자를 이요한 객체 복사
      
      color = c.color;
      gearType = c.gearType;
      door = c.door;
   }//생성자 오버로딩
   
   Car01(String color, String gearType, int door){
      this.color = color;
      this.gearType = gearType;
      this.door = door;
   }
   
   void print() {
      System.out.println("차 색상 : "+color+", 변속기 종류 : "+gearType+",차문 개수 : " + door);
   }
   
}

public class ConstTest01 {
   public static void main(String[] args) {
	   Car01 c01 = new Car01();
	   Car01 c02 = new Car01(c01);
	   c01.print();
   }
}











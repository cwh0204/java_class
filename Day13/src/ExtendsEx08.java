/*	
 *  작성일 : 2025-09-01
 *	작성자 : 최원효
 *	설명 : 생성자는 상속되지 않는다.
 *	상속관계에서 부모클래스의 기본 생성자를 호출할 때는 super();를 사용한다.
 */
class Parent08 extends Object {
    protected int x = 10;
    protected int y = 20;

    public Parent08() {
//        super();
        System.out.println("부모 Parent08 기본생성자 호출");
    }
}


class Child08 extends Parent08 {
    protected int z = 10;

    public Child08() {
//        super(); // Calls Parent08 constructor
        System.out.println("자식 Child08 기본생성자 호출");
    }

    public void pr() {
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}

public class ExtendsEx08 {
    public static void main(String[] args) {
        Child08 c = new Child08();
        c.pr();
    }
}

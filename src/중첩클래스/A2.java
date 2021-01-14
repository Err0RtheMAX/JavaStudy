package 중첩클래스;

public class A2 {

    class B2 {}

    static class C2 {}

    void method1() {
        B2 var1 = new B2();
        C2 var2 = new C2();
    }




    B2 field1 = new B2();
    // B2 내부 클래스의 인스턴스 필드 생성하기
    C2 field2 = new C2();
    // C2 내부 정적 클래스의 인스턴스 필드 생성하기

    static C2 filed4 = new C2();

    static void method2() {
        C2 var2 = new C2();
    }



}

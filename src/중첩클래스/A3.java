package 중첩클래스;
// 멤버 클래스의 사용 제한
public class A3 {

    int filed1;
    void method1() {}

    static int filed2;
    static void method2() {}

    class B3 {
        void method(){
            filed1 = 10;
            method1();

            filed2 = 10;
            method2();

        }
    }

    static class C3 {
        void method() {

            filed2 = 10;
            method2();
        }
    }
}

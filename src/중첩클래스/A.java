package 중첩클래스;

class A {
    A() { System.out.println("A 객체 생성 완료");}

    public class B {

        int field1;
        B() {System.out.println("B 객체 생성 완료");}

        void method1() {};

    }

    static class C {

        int field1;
        static int filed2;

        C() {System.out.println("C 객체 생성 완료");}

        void method1(){}
        static void method2(){}

    }


    void method() {
        class D {

            int filed1;

            D(){System.out.println("D 객체 생성 완료");}

            void method1(){}
        }


        D d = new D();
        d.filed1 = 3;
        d.method1();
    }
}

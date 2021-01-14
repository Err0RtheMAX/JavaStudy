package 중첩클래스;

public class MainA {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        // A.B b = new A().new B();
        // A클래스가 선언해서 객체를 생성해야 A 클래스에 있는 public B 클래스 생성할 수 있다.
        b.field1 = 3;
        b.method1();

        A.C c = new A.C();
        // A클래스를 선언하는 작업 없이 바로 static 클래스 C의 객체를 생성할 수 있다.
        c.field1 = 3;
        c.method1();
        // 일반적으로 선언된 int filed1와 method1()은 생성된 c 객체로 접근한다.
        A.C.filed2 = 3;
        A.C.method2();
        // static으로 선언된 static int filed2와 static method2()는 직접 클래스 내부의 static 클래스를 선언하여 접근한다.

        a.method();
        // A클래스의 메소드로 선언해야 활성화되는 D클래스를 호출한다
    }
}

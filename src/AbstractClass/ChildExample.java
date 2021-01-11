package AbstractClass;

class Parent {  // 부모 클래스
    public void method1() {
        System.out.println("AbstractClass.Parent-method1()");
    }

    public void method2() {
        System.out.println("AbstractClass.Parent-method2()");
    }

}  // 부모 클래스에서 method1, method2가 사용된다.

class Child extends Parent { // 부모 클래스를 상속 받은 자식 클래스
    @Override
    public void method2() {
        System.out.println("AbstractClass.Child-method2()");
    } // 기존 부모 클래스의 method2를 다시 재정의하는 override 수행하기

    public void method3() {
        System.out.println("AbstractClass.Child-method2()");
    }
}

public class ChildExample {
    public static void main(String[] args){
        Child child = new Child();

        Parent parent = child;
        // 자동 타입 변환 AbstractClass.Child 객체로 선언된 child 인스턴스가 AbstractClass.Parent 객체로 선언한 parent 인스턴스로 변환
        parent.method1(); // child 인스턴스의 method1이 호출되는데 상속받은 부모의 method1이다.
        parent.method2(); // 재정의된 메소드가 호출된다.
    }
}
/**
 이렇게 굳이 자동 타입을 쓰는 이유는 필드의 다형성들을 이루기 위해서다.
 */
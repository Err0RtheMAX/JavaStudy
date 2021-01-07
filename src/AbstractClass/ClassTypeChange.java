package AbstractClass;

/**
*   상속받은 자식 클래스로 객체 생성할 때 강제로 부모 클래스의 타입으로 변환시키기
*
*/
class Parent3 {
    public String field1;

    public void method1(){
        System.out.println("Parent-method1()");
    }

    public void method2(){
        System.out.println("Parent-method2()");
    }
}

class Child3 extends Parent3{
    public String field2;

    public void method3(){
        System.out.println("Child-method3()");
    }
}

public class ClassTypeChange {
    public static void main(String[] args){
        Parent3 parent = new Child3(); // 자동 타입 변동, 자식타입을 부모타입으로 자동 변동하기

        parent.field1 = "data1";
        parent.method1();
        parent.method2();


        Child3 child = (Child3) parent;
        // 부모 클래스로 생성한 인스턴스 parent를 강제로 AbstractClass.Child3 클래스의 타입으로 변환하기
        // 부모 클래스의 타입을 자동으로 자식 클래스의 타입으로 변동한다.
        // 자식 타입이 부모타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환할 때 강제 타입 변환 사용 가능
        child.field2 = "yyy";
        child.method3();
        child.method1();

    }
}

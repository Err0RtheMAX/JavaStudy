package AbstractClass;

/**
 * 객체 타입 확인하기
 */

class Parent4{

}

class Child4 extends Parent4 {

}

public class CheckObject {
    public static void method1(Parent4 parent) {
        if (parent instanceof Child4) { // Parent4로 생성한 parent 인스턴스가 AbstractClass.Child4 타입으로 변환 가능한지 보기
            Child4 child = (Child4) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method - Child로 변환 실패");
        }
    }

        public static void method2(Parent4 parent){
            Child4 child = (Child4) parent;
            System.out.println("method2 - Child로 변환 성공");
        }

        public static void main(String[] args){
            Parent4 parentA = new Child4();
            method1(parentA);
            method2(parentA);

            Parent4 parentB = new Parent4();
            method1(parentB);
          //  method2(parentB); // 예외 발생
        }
    }


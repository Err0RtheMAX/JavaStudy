package Interface;

public class MyClass {

    /* 필드 */
    RemoteControl rc = new Television();
    // 인터페이스가 필드 타입으로 사용되는 경우에는 필드에 구현 객체를 대입할 수 있다.

    /* 생성자 */
    MyClass(){

    }

    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void method1(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void method2(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }
}

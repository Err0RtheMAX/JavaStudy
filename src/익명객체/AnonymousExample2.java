package 익명객체;
import java.lang.ClassNotFoundException;
public class AnonymousExample2 {
    public static void main(String[] args){
        Anonymous2 anonymous = new Anonymous2();
        
        anonymous.field.turnOn(); // 티비를 켭니다.
        
        anonymous.method1();  // 오디오를 켭니다.
        anonymous.method2(
                // anonymous 인스턴스에서의 turnOn()인터페이스 메소드를 실행하는 메소드2를 실행시킨다.
                // 그러면 다음과 같이 override된 turnon() 메소드가 실행된다.
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("스마트 티비를 켭니다");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("스마트 티비를 끕니다");
                    }
                }
        );
    }
}

package Interface;

public interface RemoteControl {

    /* 상수 */
    public static final int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;
    // 인터페이스에서 상수 필드를 지정할 수 있다. 그러나 상수가 없는 단순한 정적 필드는 불가능하다.
    // 상수 필드는 자동으로 public static final로 지정되므로 생략해도 무관하다.


    /* 추상 메소드 */

    public abstract void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 메소드는 최종적으로 클래스 객체에서 실되므로 추상 메소드로 사용한다. 자동으로 public abstract로 선언된다.

}

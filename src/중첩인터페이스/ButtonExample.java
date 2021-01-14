package 중첩인터페이스;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setonClickListener(new CallListener());
        // Button 클래스 있는 setonClickListener 인터페이스에다가 Override된 CallListner 클래스의
        // onClick() 메소드에 대한 지시가 들어가게 된다.
        btn.touch();
        // Button 클래스로 만들어진 인스턴스 btn의 touch() 메소드 실행하기
        btn.setonClickListener(new MessageListener());
        btn.touch();
    }
}

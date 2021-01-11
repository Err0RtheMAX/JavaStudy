package Interface;

public class SmartTelevisionExample {
    public static void main(String[] args){
        SmartTelevision st = new SmartTelevision();

        RemoteControl rc = st;
        Searchable searchable = st;
        // 인터페이스 변수에 구현 객체를 대입하기
    }
}

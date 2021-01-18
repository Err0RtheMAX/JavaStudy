package 기본API클래스JavaLang;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Object) {
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number)
                return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }

    // java.lang 에 있는 public int hashCode() 메소드를 재정의 하는 Override 작업을 해서 필드 number을 반환하는 작업으로 만든다.
}

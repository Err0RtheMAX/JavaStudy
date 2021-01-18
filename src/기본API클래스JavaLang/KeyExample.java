package 기본API클래스JavaLang;
import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {

        // 키 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체를 생성한다.
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        // 식별키 new key(1)로 홍길동을 저장한다(hashMap.put)
        hashMap.put(new Key(1), "홍길동");

        // 식별키 new Key(1)로 홍길동을 읽어온다.(hashMap.get)
        String value = hashMap.get(new Key(1));
        System.out.println(value);
        System.out.println(hashMap.toString());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}

package 예외처리;

public class NullPointerException {
    public static void main(String[] args) {
        String data = null;
        // data변수가 null값을 가지기 때문에 String 객체를 참고하고 있지 않으므로
        // NullPointerException 오류가 발생한다.
        System.out.println(data.toString());
    }
}

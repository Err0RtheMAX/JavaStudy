package 예외처리;

public class ArrayIndexOutOfBoundsException2 extends Throwable {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];
        // args 배열에 실행 값을 주지 않았으므로 직접 data1, data2를 출력을 하면
        // 배열 인덱스가 범위 밖에 벗어났다는 예외처리가 발생한다.
        // 그래서 args 매개변수가 들어가도록 처리하면 오류가 발생하지 않는다.
        System.out.println("args[0] : " + data1);
        System.out.println("args[1] : " + data2);
    }
}

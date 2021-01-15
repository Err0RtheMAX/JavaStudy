package 예외처리;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다");
            return;
        }
        // 입력한 실행 매개값의 수가 모자르게 넣어버리면 ArrayIndexOutOfBoundsException 예외사항이 발생하므로
        // catch 블럭에서 걸리게 된다.

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환 불가");
        } finally {
            System.out.println("다시 실행하시길");
        }

        // 실행 매개값이 int형이 아닌 다른 형으로 주어지게 되면 format을 parseInt 메소드를 실행하지 못하므로
        // exception이 발새한다.
        // finally 블럭에서는 예외가 발생 유무에 상관없이 항상 실행하는 블럭 구간이다.
    }
}

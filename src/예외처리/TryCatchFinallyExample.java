package 예외처리;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("java.lang.String2");
        } catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다");
        }
    }
}
// try 구간에서 java.lang.String2 라는 클래스가 존재하지 않으므로 예외가 발생할 때 처리하는
// catch 부분이 실행된다.
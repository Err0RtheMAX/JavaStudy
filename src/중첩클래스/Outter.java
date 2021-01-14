package 중첩클래스;
// 로컬 클래스에서 사용 제
public class Outter {

    // JAVA7 이전 버전에는 값이 변하지 않도록 고정하는 final 키워드가 필요했다.
    public void method1(final int arg) {
        final int localVariable = 1;

        class Inner {
            public void method(){
                int result = arg + localVariable;
            }
        }
    }


    // JAVA7 이후의 버전에는 final 키워드 생략 가능하다.
    public void method2(int arg) {
        int localVariable = 1;

        class Inner {
            public void method(){
                int result = arg + localVariable;
            }
        }
    }
}

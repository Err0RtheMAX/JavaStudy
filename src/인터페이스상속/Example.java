package 인터페이스상속;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();
        // 인터페이스 A는 메소드a만 호출 가능

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();
        // 인터페이스 B는 메소드b만 호출 가능
        
        
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        // 인터페이스 C는 인터페이스 A, B를 모두 상속 받았으므로 모든 메소드 호출 가능
    }
}

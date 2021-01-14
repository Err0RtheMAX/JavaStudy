package 인터페이스상속;

public class ImplementationC implements InterfaceC {

    @Override
    public void methodA() {
        System.out.println("implementationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("implementationC-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("implementationC-methodC() 실행");
    }

}

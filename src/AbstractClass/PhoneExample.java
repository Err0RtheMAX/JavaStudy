package AbstractClass;

abstract class Phone {  // 추상화 클래스 abstract로 선언하기
    // abstract를 쓰면 new 연산자를 이용하여 객체를 만들지 항상 그대로야 한다.
    // 내용을 추가하려면 오직 상속을 통해서만 새 필드, 생성자, 메소드를 추상 클래스에 덧붙일 수 있다.

    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }


    public void TurnOn(){
        System.out.println("전원 켜기");
    }

    public void TurnOff(){
        System.out.println("전원 끄기");
    }

    public abstract void Working();
}

class SmartPhone extends Phone {
    public SmartPhone(String owner){
        super(owner);
    }

    public void internetSearch(){
        System.out.println(owner + " 인터넷 검색하기");
    }

    @Override
    public void Working(){
        System.out.println("스마트폰 작동중!");
    }
}

class NormalPhone extends Phone {
    public NormalPhone(String owner){
        super(owner); // 부모 클래스 Phone의 생성자를 가져다 사용하기 (super로 사용)
    }

    public void phoneGame(){
        System.out.println(owner + " 피쳐폰 게임하기");
    }

    @Override // Override로 추상클래스의 메소드를 재정의 해서 변경할 수 있다.
    public void TurnOn(){
        System.out.println(owner + "'s phone Turning on");
    }

    @Override
    public void Working(){
        System.out.println("일반폰 작동중!");
    }
}


public class PhoneExample {
    public static void main(String[] args){

        SmartPhone smartPhone = new SmartPhone("홍길동");
        NormalPhone normalPhone = new NormalPhone("김지수");

        smartPhone.TurnOn();
        // Phone 부모 클래스의 TurnOn 메소드 동작
        smartPhone.Working();
        // Phone 부모 클래스를 상속 받은 SmartPhone 자식 클래스에서 부모 클래스 메소드의 abstract Working()을
        // 자식 클래스에서 override한 working() 메소드를 출력하기
        smartPhone.internetSearch();
        // 자식 클래스의 internetSearch 메소드 호출하기
        smartPhone.TurnOff();
        // 부모클래스 Phone 의 TurnOff 메소드 호출하기
        System.out.println();


        normalPhone.TurnOn();

        normalPhone.Working();
        normalPhone.phoneGame();
        normalPhone.TurnOff();

    }

}

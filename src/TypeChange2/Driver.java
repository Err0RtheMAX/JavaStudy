package TypeChange2;

public class Driver {
    public void drive(Vehicle vehicle){ // 인터페이스 Vehicle을 인스턴스 만들어서 매개변수로 대입하
        vehicle.run();  // Vehicle 인터페이스의 run() 메소드 작동시키기
    }
}

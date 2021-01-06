class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Driver{
    public void drive(Vehicle vehicle){ // Driver 클래스에 인스턴스 생성된 Vehicle 객체 포함하
        vehicle.run();
    }
}

class Bus extends Vehicle {
    @Override // Driver 클래스에 인스턴스 생성된 Vehicle 객체의 run 메소드를 다시 재정의하기
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override // Driver 클래스에 인스턴스 생성된 Vehicle 객체의 run 메소드를 다시 재정의하기
    public void run(){
        System.out.println("택시가 달립니다. ");
    }
}

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); // 버스로 overriding 된 drive 메소드 출력
        driver.drive(taxi); // 택시로 overriding 된 drive 메소드 출
    }
}

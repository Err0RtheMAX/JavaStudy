package TypeChange3;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();
        // 기존 Vehicle에서는 checkFare() 메소드가 없으므로 오류 발생한다.

        Bus bus = (Bus) vehicle;
        // 그래서 vehicle을 checkFare() 메소드가 있는 Bus 클래스 타입으로 강제 타입 변환한다.
        bus.run();
        bus.checkFare();
        // checkFare() 메소드 호출 가능
    }
}

package TypeChange;

public class CarExample {
    public static void main(String[] args){
        Car mycar = new Car();

        mycar.run();
        System.out.println();
        
        mycar.frontLeftTire = new KumhoTire();
        mycar.frontRightTire = new KumhoTire();
        // 타이어 교체하기

        mycar.run();
    }
}

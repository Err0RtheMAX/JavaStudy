class Tire {
    // 필드 생성
    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    // 생성자 생성
    public Tire(String location, int maxRotation) { // location : 자동차 바퀴 위치, maxRotation : 자동차 바퀴 최대 수
        this.location = location; // 받은 매개변수로 필드의 변수에 대입하기
        this.maxRotation = maxRotation;
    }

    // 메소드 생성
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) { // 최대한 달릴 수 있는 횟수가 소비 횟수보다 작으면 남은 수명 출력하기
            System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + " 회");
            return true;

        } else {
            System.out.println("***" + location + " Tire 펑크 *** ");
            return false;
        }
    }
}

class Car{
    // 생성자를 Tire 클래스를 이용하여 생성하기
    Tire frontLeftTire = new Tire("Front-left", 6);
    Tire frontRightTire = new Tire("Front-right", 2);
    Tire backLeftTire = new Tire("Back-left", 3);
    Tire backRightTire = new Tire("Back-right", 4);

    int run(){
        System.out.println("Running car");
        if(frontLeftTire.roll() == false){stop(); return 1;}
        else if(frontRightTire.roll() == false){stop(); return 2;}
        else if(backLeftTire.roll() == false){stop(); return 3;}
        else if (backRightTire.roll() == false){stop(); return 4;}
        return 0;
    }

    void stop(){
        System.out.println("Stop the car");
    }

}

class HankookTire extends Tire{

    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation){
            System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }

        else{
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}

class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }


    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + " 회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
}


public class CarExample {
    public static void main(String[] args){
        Car car = new Car();

        for(int i = 1; i <= 5; i++){
            int problemLocation = car.run(); // run() 메소드에서 리턴한 값을 problemLocation으로 입력하기

            switch(problemLocation){
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("Front-left", 15);
                    break;

                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("Front-right", 13);
                    break;

                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("Back-left", 14);
                    break;

                default:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRightTire = new KumhoTire("Back-right", 17);
                    break;

            }
            System.out.println("-----------------------------------");
        }
    }
}

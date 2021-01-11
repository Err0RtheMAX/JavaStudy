package Interface;

public class Television implements RemoteControl {
    // RemoteControl이라는 인터페이스를 구현했음을 표현하기 위해 impements 사용
    // RemoteControl에 구현된 모든 추상 메소드에 대한 정의가 Override가 되어 있어야 한다.

    /* 필드 */
    private int volume;



    /* 인터페이스에서 언급된 추상 메소드를 다시 재정의 하는 Override해서 최종 메소드에 대한 정의를 쓴다.*/
    public void turnOn(){
        System.out.println("텔레비전을 켭니다.");
    }

    public void turnOff(){
        System.out.println("텔레비전을 끕니다");
    }

    public void setVolume(int volume){

        if(volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;

        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;

        else
            this.volume = volume;

        System.out.println("현재 텔레비전 볼륨은 " + this.volume);
    }


    public static void main(String[] args){
        Television tv = new Television();
        tv.turnOn();

        tv.setVolume(-2);
        tv.setVolume(2);
        tv.setVolume(11);

        tv.turnOff();
        // 다음과 같이 인터페이스를 이용하여 Override한 클래스 객체를 가지고 인스턴스 tv를 생성할 수 있지만
        // 이것은 직접적으로 인터페이스를 호출하여 사용하는 것이 아니다.
        // RemoteControlExample.java가 직접적으로 인터페이스를 호출하여 사용하는 것이다.
    }
}




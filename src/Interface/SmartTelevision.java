package Interface;

public class SmartTelevision implements Searchable, RemoteControl{
    private int volume;

    public void turnOn(){
        System.out.println();
    }

    public void turnOff(){
        System.out.println();
    }

    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;

        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;

        else
            this.volume = volume;

        System.out.println("현재 볼륨 : " + this.volume);
    }

    public void search(String url){
        System.out.println(url + " 을 검색하기");

    }
}

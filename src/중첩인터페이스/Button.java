package 중첩인터페이스;

public class Button {
    OnClickListener listener;
    // 버튼 클래스 내부에 있는 OnClickListner 인터페이스를 사용하기 위해 인터페이스 인스턴스 생성완료

    void setonClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}

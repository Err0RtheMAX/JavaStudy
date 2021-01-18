package 기본API클래스JavaLang;

public class SystemTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;

        for(int i = 0; i <= 1000000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();

        System.out.println(time2 - time1);
        // 1부터 1000000까지 덧셈하는데 걸리는 시간 나노초로 표현하기.


    }
}

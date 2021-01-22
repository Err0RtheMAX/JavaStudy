package 기본API클래스JavaLang;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");

        // new Integer로 int형 객체를 선언할 수 있지만 Integer.valueOf로 선언하는게 더 좋다.

        Integer obj3 = Integer.valueOf("300");
        Integer love = Integer.valueOf(10);

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();
        int value4 = love.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);


    }
}

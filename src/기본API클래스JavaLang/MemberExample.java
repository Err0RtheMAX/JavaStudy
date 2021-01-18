package 기본API클래스JavaLang;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("Blue");
        Member obj2 = new Member("Yellow");
        Member obj3 = new Member("Red");

        if (obj1.equals(obj2))
            System.out.println("1과 2는 동등");

        else
            System.out.println("1과 2는 동등하지 않음");

        if (obj2.equals(obj3))
            System.out.println("2와 3은 동등");

        else
            System.out.println("2와 3은 동등하지 않음");
    }
}

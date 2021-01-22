package 기본API클래스JavaLang;

import java.util.Locale;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str = "Wow this is amazing!";
        String str2 = "wow this is amazing!";

        System.out.println(str.equals(str2));
        // 대소문자까지 일치하는지 비교하는 equals()
        System.out.println((str.toLowerCase()).equals(str2.toLowerCase()));
        System.out.println(str.equalsIgnoreCase(str2));
        // 대소문자 무시하고 같은지 비교하는 equalsIgnoreCase()
    }
}

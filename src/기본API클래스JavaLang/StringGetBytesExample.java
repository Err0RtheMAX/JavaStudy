package 기본API클래스JavaLang;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";
        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length: " + bytes1.length);
        String str1 = new String(bytes1);
        System.out.println("bytes1->String " + str1);
        // 기본 문자셋(UTF-8)로 인코딩 및 디코딩 작업 하기
        try{
            byte[] bytes2 = str.getBytes("UTF-16");
            System.out.println("bytes2.length : " + bytes2.length);
            String str2 = new String(bytes2, "UTF-16");
            System.out.println("byte2->String: " + str2);
            // UTF-16로 인코딩, 디코딩 작업하기
            byte[] bytes3 = str.getBytes("EUC-KR");
            System.out.println("bytes3.length: " + bytes3.length);
            String str3 = new String(bytes3, "EUC-KR");
            System.out.println("bytes3->String: "+ str3);
            // EUC-KR로 인코딩, 디코딩 작업하기
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            // 인코딩 할 때의 예외 사항이 발생할때 catch 부분에서 처리하
        }
    }
}

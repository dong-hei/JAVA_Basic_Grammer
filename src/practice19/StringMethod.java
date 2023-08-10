package practice19;

public class StringMethod {
    public static void main(String[] args) {
//         리터럴에 직접 대입
        String str1 = "bonjour";
        System.out.println(str1);

//        String 객체를 생성
        String str2 = new String("hello");
        System.out.println(str2);


//        index에 있는 문자 리턴
        System.out.println(str1.charAt(0));

//        길이 리턴 length()
        System.out.println(str1.length());

//        앞 뒤 공백 제거
        String str3 = new String("           nice to meet you   ");
        System.out.println(str3.trim());

//        문자열 비교
        System.out.println(str1.equals(str2));

//        구분자로 문자열 구분
        String data = new String("hello,AhnNyung,Ohaiyo,Nihao");
        String a[] = data.split(",");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

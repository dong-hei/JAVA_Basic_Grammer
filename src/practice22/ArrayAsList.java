package practice22;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
//        배열을 컬렉션으로 바꾸기
//        Array.asList()를 사용하여 String[] 배열을 컬렉션으로 쉽게 바꿀 수 있다. asList() 메소드는 static으로 선언되었기 때문에 객체 생성없이 클래스명.메소드로 바로 사용 가능하다.
        String[] strArr = {"축구", "야구", "농구", "핸드볼"};

        for(String s :strArr)
            System.out.println(s);

        List<String> listArr = Arrays.asList(strArr);
//        아래처럼 컬렉션을 바로 출력할수있다.
//        for (List il : listArr) 오류 발생
//        sout(l); 오류 발생

//        다음과 같이 get() 메소드를 사용해 list 데이터를 출력한다
        for(int i = 0; i < listArr.size(); i++)
            System.out.println(listArr.get(i));
        }
}

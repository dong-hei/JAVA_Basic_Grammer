package practice22;

import java.util.ArrayList;
import java.util.List;

public class ToArrayTest {

    public static void main(String[] args) {
//컬렉션을 배열로 바꾸자
        List<String> mList = new ArrayList<String>();
        //ArrayList<String> mList = new ArrayList<String>(); 와 같다

        mList.add("이명박");
        mList.add("김영삼");
        mList.add("노태우");

        String[] str = mList.toArray(new String[mList.size()]); //to Array()를 메소드로 사용하면 컬렉션(List)의 값을 String[] 배열로 변환할 수 있다.
//        자바에서 String 은 유니코드로 처리되며 String 은 문자열 자체를 수정할 수 가 없기 때문에 List를 사용하여 데이터를 추가,삭제한 후에 String[] 배열로 변환하는 작업을 해아한다.

        for(String s: str)
            System.out.println(s);
    }
}

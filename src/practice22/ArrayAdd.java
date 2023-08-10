package practice22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAdd {

    public static void main(String[] args) {
        //    배열을 컬렉션으로 바꾼다음에 컬렉션에 데이터를 추가하는 방법

        String[] strArr = {"축구", "야구", "농구", "핸드볼"};
        List<String> listArr = Arrays.asList(strArr);

        //    listArr.add("딸기"); 오류 발생 - listArr는 수정이 불가능한 String[] 배열의 주소를 참조하고 있기 때문
//    리스트에 데이터를 추가하기 위해 새로운 list 객체 필요
        List<String> listArr2 = new ArrayList<>(listArr);
        listArr2.add("하키");

        for (int i = 0; i < listArr2.size(); i++)
            System.out.println(listArr2.get(i));
    }


}

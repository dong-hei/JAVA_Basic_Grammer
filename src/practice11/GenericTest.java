package practice11;

import java.util.ArrayList;

public class GenericTest {
//   배열에서 나타나는 데이터를 추가로 삽입하거나 삭제할수없는 문제를 극복하고자 Collection을 제공한다.
    //    ArrayList는 list계열의 클래스이다.(Collection)
    //제네릭 ArrayList로 값을 꺼내서 사용할 때는 반드시 형변환을 해야 오류가 생기지 않는다
    //매번 형변환을 하는건 번거롭다. 이를 극복하기위해 제네릭이 탄생했다 <> 기호를 사용해 데이터타입을 미리 지정한다.ㅕ
//    제네릭을 사용하지 않을 경우
//    public static void main(String[] args) {
//        int sum = 0;
//        ArrayList list = new ArrayList();
//        list.add(12);
//        list.add(24);
//        list.add(36);
//
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i); int형인 sum에 대입했기때문에 이부분에서 컴파일 오류가 발생한다.
//            문제해결을 위해서 sum += (int)list.get(i); 로 캐스팅해야한다. 매번 형변환을 해야한다면 번거롭다.
//            System.out.println(sum);
//        }
//    }
        public static void main(String[] args) {
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(12);
            list.add(55);
            list.add(125);
            for (int i = 0; i < list.size(); i++)
                    sum += list.get(i);
                System.out.println(sum);

        }

}

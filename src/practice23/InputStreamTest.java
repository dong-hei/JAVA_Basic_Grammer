package practice23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
//Stream을 통해 데이터를 송수신한다.
//   Stream Class
//   클래스 이름에 Stream 이ㄷ 들어가면 바이트 기반 스트림이고
//    Reader,Writer가 들어가면 문자 기반 스트림
//    예를들어 FileWriter 클래스는 문자 기반의 출력 스트림이다.
//    InputStream과 OutputStream은 최상위 입출력 클래스이며 이 최상위 클래스들을 상속받는 클래스들은 뒤에 InputStream과 OutputStream이 붙는다.
//    마찬가지로 Reader와 Writer 클래스는 문자 기반의 최상위 클래스이며 이들에서 파생된 스트림들은 Reader,Writer를 접미사로 사용한다.

    public static void main(String[] args) throws IOException {
        int readByte;
        int count = 0;
        InputStream is = new FileInputStream("C:/Users/kbs24/Downloads/textxt.txt");
        byte mByte;

        while ((readByte = is.read()) != -1) {
            count += 1;
            System.out.print((char) readByte);
        }
        System.out.println(count);
        is.close();
    }
//    read() 메소드 1바이트씩 데이터를 읽어온다 -> int 형 변수에 값을 넣는다
//    왜? int 형인 4바이트 변수 앞에 3바이트는 비어있고 마지막 바이트에만 읽은 값이 들어간다
//    더이상 읽을 데이터가 없으면 read 메소드는 -1 값을 리턴한다.
}

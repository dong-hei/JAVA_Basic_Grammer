package practice23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {
//    byte[] 배열을 사용해 한번에 읽어오겠다 읽어올 데이터가 20이기 떄문에 배열 길이를 그보다 큰 25로 하겠다.
    public static void main(String[] args) throws IOException {
        int readByte;
        int count = 0;
        InputStream is = new FileInputStream("C:/Users/kbs24/Downloads/textxt.txt");
        byte[] mBytes = new byte[25];

        while ((readByte = is.read(mBytes)) != -1) {
            count += 1;
//            바이트 배열을 String 으로 변환하기 위해 String 생성자에 바이트 배열을 넣는다.
            String data = new String(mBytes, "US-ASCII");
            System.out.print(data);
//            sout(data.lenght());
        }
        System.out.print(count);
        is.close();
    }
}

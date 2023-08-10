package practice23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {
    public static void main(String[] args) throws IOException {
        // write() 메소드에 매개변수로 배열값을 직접 주지 않고, 바이트 배열의 주소를 넘겨주면 한번에 출력 가능
        OutputStream os = new FileOutputStream("C:/Users/kbs24/Downloads/outputest2.txt");

        String s = "OutputStreamTest 2 ";
        byte[] mBytes = s.getBytes();

        os.write(mBytes);
        os.close();

    }
}

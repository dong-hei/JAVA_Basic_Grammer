package practice23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        int count = 0; //write() 메소드가 몇번 실행되는지 확인한다.
        OutputStream os = new FileOutputStream("C:/Users/kbs24/Downloads/outputext.txt");

        String s = "Hello This is OutputStream in JAVA"; //문자열을 outputtext 파일에 저장하는 구문
        byte[] mBytes = s.getBytes();

        for (int i = 0; i < mBytes.length; i++){
            os.write(mBytes[i]); //byte 수만큼 write() 메소드를 반복 실행한다.
        }
    }
}

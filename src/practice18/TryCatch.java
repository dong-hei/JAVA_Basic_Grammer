package practice18;

public class TryCatch {
//    자바의 오류 1. Compile Error = 코드를 컴파일하게되면 클래스 파링ㄹ이 생긴다. 컴파일 하는 동안 오타나 잘못된 구문인지 체크해 컴파일 에러를 발생시킨다.
//              2. Runtime Error = 프로그램 실행중에 발생하는 오류다 이 오류는 에러와 예외(Exception)으로 나눌수있다. exception은 코드를 통해 수습할 수 있는 미약한 에러다. try~catch 블록으로 해결 가능
    public static void main(String[] args) {
        int a = 10;
        int result = 0;

        try {
            result = 10 / 0;
//             에러가 발생할 수도 있는 코드
        } catch (ArithmeticException e) {
            System.out.println("오류 사유: " + e.getMessage());
            System.out.println("0으로 나누면 안됩니다");
//            예외가 발생하면 실행되는 코드
        } finally{
            System.out.println("finish");
//            예외가 발생하든 안하든 무조건 실행되는 코드 (선택 사항)
        }
    }
}

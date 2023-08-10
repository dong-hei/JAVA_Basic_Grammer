package practice10;

public class Loop {
//    1부터 10까지
    public static void main(String[] args) {
        System.out.println("-----------------------------------while----------------------------------------");
        int sum = 0;
        int i = 1;
        while (true) {
            System.out.println(sum = sum + i);
            i++; //i값을 1씩 증가시킨다
            if(i>10) break;  // break 문을 만나면 반복문을 종료시킨다.
        }
        System.out.println("-----------------------------------for----------------------------------------");
        int sumFor = 0; //합을 담을 변수
        for (int a = 1; a < 11; a++) {
            System.out.println(sumFor = sumFor + a);
        }
        System.out.println("-----------------------------------continue----------------------------------------");
        for (int b = 1; b <= 10; b++) {
            if(b%2==0) continue; //2로 나누어떨어지면 continue가 실행되어 for문의 마지막으로 이동해 i 값이 출력되지 않는다
            System.out.println(b+" "); //홀수만 출력
        }

    }
}

package practice17;

public class parsing {
    public static void main(String[] args) {
//        문자를 숫자로 변경하는 방법 parseInt() 메소드 안에 큰따옴표를 이용해 문자를 넣는다.
        int score;
        score = Integer.parseInt("100");
        System.out.println(score);

        double dl;
        dl = Double.parseDouble("3.14");
        System.out.println(dl);

        //숫자를 문자로 변경하는 방법  1. 숫자에 큰따옴표 두개를 붙여서 사용한다.
        int sum = 100;
        String sumTxt ="합계는 " +  sum + " 이다.";
        System.out.println(sumTxt);

        //Integer 클래스의 toString 메소드를 이용한다.
        int num = 52;
        String sumText = Integer.toString(num);
        System.out.println(num);
    }
}

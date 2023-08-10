package practice11;

public class Array_WithEnhancedFor {

    public static void main(String[] args) {
        int[] height = {155, 161, 167, 170, 178, 183, 185};

        for(int i : height){ //for(자료형 변수명 : 배열이름){// 반복처리할 문장}
            // 정수형 변수 i는 배열 height의 인덱스 0부터 마지막까지 값을 하나씩 가져온다
            // 자동으로 인덱스 값을 증가시킨다.
            System.out.println(height[i] + "cm");
        }
    }

}

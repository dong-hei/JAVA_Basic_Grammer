package practice11;

public class Array {
    public static void main(String[] args) {
//        배열은 여러개의 데이터를 다루는데 쉽고 편리한 자료구조다.
//        하지만 배열은 크기가 정해지면 작업 중간에 크기를 조절할수 없다. 즉 데이터를 추가로 삽입하거나 삭제할수없다.
//        배열을 선언하고 배열을 생성할 때 초기화 하는 방법
        int[] height;
        height = new int[5];

        height[0] = 161;
        height[1] = 164;
        height[2] = 168;
        height[3] = 177;
        height[4] = 183;

        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i] + "cm");
        }
        //변수 length는 배열의 height 의 크기인 5값을 가지고 있다.
    }
}

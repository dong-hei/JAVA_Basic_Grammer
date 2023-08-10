package practice11;

import java.util.ArrayList;

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(55);
        list.add(125);

        for (int i : list)
            System.out.println(i);
    }




}

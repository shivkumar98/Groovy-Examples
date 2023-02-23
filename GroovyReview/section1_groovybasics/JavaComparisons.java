package section1_groovybasics;

import java.util.ArrayList;

public class JavaComparisons {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nestedArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> innerArray = new ArrayList<>();
        innerArray.add(63);
        nestedArray.add(0, innerArray);
        System.out.println(nestedArray);

        ArrayList<Integer> list = new ArrayList<>();
        list.set(2, 0); // throws IndexOutOfBoundsExceptions
        System.out.println(list);

    }
}
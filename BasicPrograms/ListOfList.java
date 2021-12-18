package BasicPrograms;

import java.util.*;
public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner= new ArrayList<>();
        inner.add(1);
        inner.add(2);
        inner.add(3);
        List<Integer> inner2= new ArrayList<>();
        inner2.add(1);
        inner2.add(2);
        inner2.add(3);
        list.add(inner);
        list.add(inner2);
        System.out.println(list);
    }
}

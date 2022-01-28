package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        Hashtable<Integer,Integer> ht =new Hashtable<>();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        int max = Integer.MIN_VALUE;
        System.out.println(hs.size());
        hs.add('i');
        hm.put(1,"yawar");
        hm.put(2,"shakir");
        hm.put(3,"Danish");
        for (Map.Entry<Integer,String> mp : hm.entrySet()){
            System.out.println(mp.getKey()+" ");
            System.out.println(mp.getValue()+" ");
        }
    }
}

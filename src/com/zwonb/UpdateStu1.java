package com.zwonb;

import java.util.*;

/**
 * Map集合
 * Created by zwonb on 2017/7/11.
 */
public class UpdateStu1 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","周同学");
        map.put("02","李同学");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        System.out.println("key集合中的元素：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collection<String> values = map.values();
        iterator = values.iterator();
        System.out.println("values集合中的元素");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

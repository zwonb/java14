package com.zwonb;

import java.util.*;

/**
 * map集合测试
 * Created by zwonb on 2017/7/11.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Emp emp = new Emp("315", "张三");
        Emp emp1 = new Emp("513", "李四");
        Emp emp2 = new Emp("853", "王一");
        Emp emp3 = new Emp("125", "赵六");
        Emp emp4 = new Emp("341", "黄七");

        map.put(emp.getId(), emp.getName());
        map.put(emp1.getId(), emp1.getName());
        map.put(emp2.getId(), emp2.getName());
        map.put(emp3.getId(), emp3.getName());
        map.put(emp4.getId(), emp4.getName());

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        System.out.println("HashMap类实现的Map集合，键对象无序：");
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " " + value);
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> iterator1 = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            String name = treeMap.get(key);
            System.out.println(key + " " + name);
        }
    }
}

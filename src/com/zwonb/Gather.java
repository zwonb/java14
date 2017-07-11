package com.zwonb;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口的实现类
 * Created by zwonb on 2017/7/9.
 */
public class Gather {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int) (Math.random() * list.size()); //获得0-2之间的随机数
        System.out.println("随机获取数组中的元素：" + list.get(i));
        list.remove(2);
        System.out.println("将索引是'2'的元素从数组移除后，数组中的元素是：");
        for (String aList : list) {
            System.out.println(aList);
        }
    }
}

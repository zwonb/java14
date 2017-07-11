package com.zwonb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口
 * Created by zwonb on 2017/7/9.
 */
public class Muster {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //添加数据
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("c");
        Iterator<String> iterator = list.iterator(); //创建迭代器
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

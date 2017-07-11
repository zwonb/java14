package com.zwonb;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Set集合
 * Created by zwonb on 2017/7/9.
 */
public class UpdateStu implements Comparable<Object> {

    String name;
    long id;

    public UpdateStu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    /**
     * 存入TreeSet必须实现的接口--比较器
     */
    @Override
    public int compareTo(Object o) {
        UpdateStu updateStu = (UpdateStu) o;
        return id > updateStu.id ? 1 : (id == updateStu.id ? 0 : -1);
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 521);
        UpdateStu stu2 = new UpdateStu("陈同学", 529);
        UpdateStu stu3 = new UpdateStu("王同学", 553);
        UpdateStu stu4 = new UpdateStu("马同学", 522);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> iterator = tree.iterator();
        while (iterator.hasNext()) {
            UpdateStu stu = iterator.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        iterator = tree.headSet(stu2).iterator();
        System.out.println("截取前面部分的集合：");
        while (iterator.hasNext()) {
            UpdateStu stu = iterator.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        iterator = tree.subSet(stu2, stu3).iterator();
        System.out.println("截取中间部分的集合");
        while (iterator.hasNext()) {
            UpdateStu stu = iterator.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 分区：将stream按条件分为两个Map，比如员工按薪资是否高于8000分为两部分。
 * 分组：将集合分为多个Map，比如员工按性别分组。有单级分组和多级分组。
 */
public class StreamCollect2 {

    /**
     * 将员工按薪资是否高于8000分为两部分；将员工按性别和地区分组
     */
    @Test
    public void group() {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, "male", "New York"));
        personList.add(new Person("Jack", 7000, "male", "Washington"));
        personList.add(new Person("Lily", 7800, "female", "Washington"));
        personList.add(new Person("Anni", 8200, "female", "New York"));
        personList.add(new Person("Owen", 9500, "male", "New York"));
        personList.add(new Person("Alisa", 7900, "female", "New York"));

        // 将员工按薪资是否高于8000分组
        Map<Boolean, List<Person>> part = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));

        // 将员工按性别分组
        Map<String, List<Person>> group = personList.stream().collect(Collectors.groupingBy(Person::getSex));

        // 将员工先按性别分组，再按地区分组
        Map<String, Map<String, List<Person>>> group2 = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
        System.out.println("员工按薪资是否大于8000分组情况：" + part);
        System.out.println("员工按性别分组情况：" + group);
        System.out.println("员工按性别、地区：" + group2);


    }

}

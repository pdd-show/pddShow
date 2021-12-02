package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 收集，把一个流收集起来，最终可以是收集成一个值也可以收集成一个新的集合。
 *
 *      归集(toList/toSet/toMap) :因为流不存储数据，那么在流中的数据完成处理后，
 *                                需要将流中的数据重新归集到新的集合里
 *      toCollection、toConcurrentMap
 *      collect主要依赖java.util.stream.Collectors类内置的静态方法
 */
public class StreamCollect {


    /**
     * 求Integer集合的元素之和、乘积和最大值
     */
    @Test
    public void toCollection(){

        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));

        Map<String, Integer> map = personList.stream().filter(p -> p.getSalary() > 8000).collect(Collectors.toMap(Person::getName, p -> p.getSalary()));

        System.out.println("toList:" + listNew);
        System.out.println("toSet:" + set);
        System.out.println("toMap:" + map);

    }

    /**
     * Collectors提供了一系列用于数据统计的静态方法
     */
    @Test
    public void amountCount(){

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        // 求总数
        Long count = personList.stream().collect(Collectors.counting());
        // 求平均工资
        Double average = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        // 求工资之和
        Integer  sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
        // 一次性统计所有信息
        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));


        System.out.println("员工总数：" + count);
        System.out.println("员工平均工资：" + average);
        System.out.println("员工工资总和：" + sum);
        System.out.println("员工工资所有统计：" + collect);

    }

    /**
     * 分区：将stream按条件分为两个Map，比如员工按薪资是否高于8000分为两部分。
     * 分组：将集合分为多个Map，比如员工按性别分组。有单级分组和多级分组。
     */
    @Test
    public void group(){




    }

}

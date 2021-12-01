package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 筛选：按照一定的规则校验流中的元素，
 *      将符合条件的元素提取到新的流中的操作。
 */
public class StreamIteratorFilter {

    /**
     * 筛选出Integer集合中大于7的元素，并打印出来
     */
    @Test
    public void filter(){
        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        Stream<Integer> stream = list.stream();
        stream.filter(x -> x > 7).forEach(System.out::println);
    }


    /**
     * 筛选员工中工资高于8000的人，并形成新的集合。
     * 形成新集合依赖collect（收集），后文有详细介绍
     */
    @Test
    public void collection(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<String> filterList = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.println("高于8000的员工姓名：" + filterList);


    }




}

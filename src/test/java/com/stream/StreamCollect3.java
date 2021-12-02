package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 接合：joining可以将stream中的元素用特定的连接符（没有的话，则直接连接）连接成一个字符串。
 *
 */
public class StreamCollect3 {

    /**
     * 拼接所有员工的名字；
     * 拼接字符串
     */
    @Test
    public void join() {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        String names = personList.stream().map(p -> p.getName()).collect(Collectors.joining(","));
        System.out.println("所有员工的姓名: " + names);

        List<String> list = Arrays.asList("A", "B", "C");
        String string = list.stream().collect(Collectors.joining("-"));
        System.out.println("拼接后的字符串: " + string);


    }

}

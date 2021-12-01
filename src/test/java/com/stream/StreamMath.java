package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.*;

/**
 * 聚合：数据统计
 */
public class StreamMath {

    /**
     * 获取String集合中最长的元素
     */
    @Test
    public void max(){
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println("最长的字符串：" + max.get());
    }

    /**
     * 获取Integer集合中的最大值
     */
    @Test
    public void max2(){
        List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);
        // 自然排序
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        // 自定义排序
        Optional<Integer> max2 = list.stream().max(Comparator.naturalOrder());


        list.stream().max((o1, o2) -> o1.compareTo(o2));

        list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


        System.out.println("自然排序的最大值：" + max.get());
        System.out.println("自定义排序的最大值：" + max2.get());
    }

    /**
     * 获取员工工资最高的人
     */
    @Test
    public void max3(){

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("员工工资最大值：" + max.get().getSalary());

    }

    /**
     * 计算Integer集合中大于6的元素的个数
     */
    @Test
    public void cont(){
        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }
    /**
     * 映射，可以将一个流的元素按照一定的映射规则映射到另一个流中。
     *       分为map和flatMap：
     *   map:接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
     *   flatMap:接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
     *
     */
    @Test
    public void flat(){
        List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }





}

package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 排序：
 *      sorted，中间操作。有两种排序：
 *          sorted()：自然排序，流中元素需实现Comparable接口
 *          sorted(Comparator com)：Comparator排序器自定义排序
 *
 */
public class StreamSort {

    /**
     * 将员工按工资由高到低（工资一样则按年龄由大到小）排序
     *
     */
    @Test
    public void reduce() {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Sherry", 9000, 24, "female", "New York"));
        personList.add(new Person("Tom", 8900, 22, "male", "Washington"));
        personList.add(new Person("Jack", 9000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 8800, 26, "male", "New York"));
        personList.add(new Person("Alisa", 9000, 26, "female", "New York"));


        // 按工资升序排序（自然排序）：默认是升序
        List<String> newList = personList.stream().sorted(Comparator.comparing(Person::getSalary))
                .map(Person::getName).collect(Collectors.toList());

        // 按工资倒序排序
        List<String> newList2 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed())
                .map(Person::getName).collect(Collectors.toList());

        // 先按工资再按年龄升序排序
        List<String> newList3 = personList.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());

        // 先按工资再按年龄自定义排序（降序）

        List<String> newList4 = personList.stream().sorted((p1, p2) -> {
            if (p1.getSalary() == p2.getSalary()) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getSalary() - p1.getSalary();
            }
        }).map(Person::getName).collect(Collectors.toList());

        System.out.println("按工资升序排序：" + newList);
        System.out.println("按工资降序排序：" + newList2);
        System.out.println("先按工资再按年龄升序排序：" + newList3);
        System.out.println("先按工资再按年龄自定义降序排序：" + newList4);





    }



}

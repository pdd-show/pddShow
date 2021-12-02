package com.stream;

import com.pdd.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 归约：Collectors类提供的reducing方法，相比于stream本身的reduce方法，增加了对自定义归约的支持
 *
 */
public class StreamCollect4 {

    /**
     * 每个员工减去起征点后的薪资之和
     *
     */
    @Test
    public void reduce() {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));


        // stream的reduce
        Optional<Integer> sum2 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
        System.out.println("员工薪资总和：" + sum2.get());

    }

}

package com.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream概述：Java 8 是一个非常成功的版本，这个版本新增的Stream，配合同版本出现的 Lambda ，
 *          给我们操作集合（Collection）提供了极大的便利。
 * Stream功能：将要处理的元素集合看作一种流，在流的过程中，借助Stream API对流中的元素进行操作，
 *          比如：筛选、排序、聚合等。
 *
 */
public class StreamBuild {

    /**
     * Stream可以由数组或集合创建
     * 方式一：通过 java.util.Collection.stream() 方法用集合创建流
     */
    @Test
    public void buildStream(){
        List<String> list = Arrays.asList("VG", "LGD", "IG", "RNG", "XG", "MDY");

        /**
         * stream()和parallelStream()的简单区分
         *      stream()是顺序流，由主线程按顺序对流执行操作。
         *      parallelStream()是并行流，内部以多线程并行执行的方式对流进行操作，
         *                      但前提是流中的数据处理没有顺序要求。比如筛选集合中的奇数。
         */
        // 创建一个顺序流
        Stream<String> stream = list.stream();
        // 创建一个并行流
        Stream<String> parallelStream = list.parallelStream();

        // 缺顺序流和并行流之间的转换


    }

    /**
     * Stream可以由数组或集合创建
     * 方式二：使用java.util.Arrays.stream(T[] array)方法用数组创建流
     */
    @Test
    public void buildStream2(){
        int[] array = {1,3,5,7,9};
        IntStream stream = Arrays.stream(array);

    }

    /**
     * Stream可以由数组或集合创建
     * 方式三：使用Stream的静态方法：of()、iterate()、generate()
     */
    @Test
    public void buildStream3(){

        Stream<Integer> stream = Stream.of(1, 3, 5, 7, 9);

        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);

    }




}

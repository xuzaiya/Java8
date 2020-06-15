package com.chongqing.streams;

import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        //IntStream.of(new int[]{5,6,7,}).forEach(System.out::println);
        //IntStream.of(new int[]{3,4,5,53}).forEach(item-> System.out.println(item));

        System.out.println("======================");

        //（3,9）包含前面不包含后面
        //IntStream.range(3,9).forEach(System.out::println);
        System.out.println("======================");
        // 包含后面的
        IntStream.rangeClosed(3,9).forEach(System.out::println);
    }
}

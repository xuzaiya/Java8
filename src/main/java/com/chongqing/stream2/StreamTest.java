package com.chongqing.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//静态导入的方式
import static java.util.stream.Collectors.*;
//快捷键 Ctrl+w  选中一个单词
public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",100);
        Student student4 = new Student("zhaoliu",90);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4);
        List<Student> students = studentList.stream().collect(Collectors.toList());
        students.forEach(System.out::println);

        System.out.println("============================");
        //得到集合中元素的个数
        System.out.println("count:"+studentList.stream().collect(Collectors.counting()));
        System.out.println("count:"+studentList.stream().collect(counting()));
        System.out.println("count:"+studentList.stream().count());
    }

}

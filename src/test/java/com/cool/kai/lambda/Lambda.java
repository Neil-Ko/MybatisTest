package com.cool.kai.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setAge(i);
            person.setUserName("Neil");
            personList.add(person);
        }
        String collect = personList.stream().map(Person::getUserName).collect(Collectors.joining(","));
        Set<String> collect1 = personList.stream().map(Person::getUserName).collect(Collectors.toSet());
        TreeSet<String> collect2 = personList.stream().map(Person::getUserName).collect(Collectors.toCollection(TreeSet::new));
        IntSummaryStatistics intSummaryStatistics = personList.stream().mapToInt(p -> p.getAge()).summaryStatistics();
        System.out.println(intSummaryStatistics);


//        System.out.println(collect2);


    }
}

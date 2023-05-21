package org.chan;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class StreamStuff {

    public static void main(String[] args) {
        String employee = """
            Darith, Chan, 1/1/1988, Software Engineer
            Chanthou, Eang, 1/4/1989, CFO
            Tommy, Angkor, 3/9/1990, Marketing Manager
            Sokhun, Thuch, 4,6,1980, Sale Manager
            """;

        employee
                .lines()
                .forEach(s -> System.out.println(s));


        List<String> nums = List.of("One", "Two", "Three", "Four");

        nums.stream()
                .map(String::length)
                .forEach(System.out::println);


        Collection<String> fruit = Set.of("Apple", "Banana", "Duran", "Egg Plant");



    }

}

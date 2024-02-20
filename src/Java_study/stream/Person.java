package Java_study.stream;

import com.sun.source.doctree.StartElementTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public static void main(String[] args) {
            List<Member> members = new ArrayList<>();
            members.add(new Member("가", 40));
            members.add(new Member("나", 30));
            members.add(new Member("다", 22));

            List<Person> personList = members.stream()
                        .map(m -> new Person(m.getName(), m.getAge()))
                        .toList();

                        System.out.println(personList);
        }
    }


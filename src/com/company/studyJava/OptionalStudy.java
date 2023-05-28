package com.company.studyJava;

import java.util.*;

public class OptionalStudy {
    public static void main(String[] args) {

        User user = new User(null, 3);

        Optional<User> optionalUser = Optional.of(user);
        Optional<String> optionalString = Optional.ofNullable(user.getName());
        String test = optionalString.orElse("값이 없단다");
        System.out.println("optionalString = " + test);


        List<String> list1 = new ArrayList();
        Optional<List<String>> op = Optional.of(list1); // get을 하면 바로 에러
        List<String> resultList = Optional.ofNullable(list1).orElseGet(() -> new ArrayList()); //ofNullable null 일 수도 있다.

        Map<Long, User> store = new HashMap<>();


        Optional<User> dd = store.values().stream().filter(user1 -> user1.getName().equals("dd")).findAny();


    }

    static class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

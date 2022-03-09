package com.company.ch14_Lamda_stream.collector;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectClass {
    /**
     * collect()와 Collectors
     * collect()는 Collector를 매개변수로 하는 스트림의 최종 연산
     * Object collect(Collector collector) // Collector를 구현한 클래스의 객체를 매개변수로
     * Object collect ( Supplier supplier, BiConsumer accumulator, BiConsumer combiner) // 잘 안쓰임
     * Collector 는 수집에 필요한 메서드를 정의해 놓은 인터페이스
     * Collectors 클래스는 다양한 기능의 컬렉터를 제공
     * 변환 - mapping(), toList(), toSet(), toMap(), toCollection() ...
     * 통계 - counting(), summingInt(), averageingInt(), maxBy(), minBy(), summarizingInt()...
     * 문자열 결합 - joining()
     * 리듀싱 - reducing()
     * 그룹화와 분활 - groupingBy() - n분활, partitioningBy() -2분활, collectingAndThen()
     *
     * 스트림을 배열로 반환
     * Student[] stuNames = studentStream.toArray(Student[]::new);
     * Student[] stuNames = studentStream.toArray(); // X
     * Object[] stuNames = studentStream.toArray(); // O
     *
     *
     * */

    public static void main(String[] args) {
        Student[] stuArr = {
            new Student("가가가", true, 1, 1, 300),
            new Student("가나다", false, 2, 3, 200),
            new Student("라라라", true, 1, 2, 240),
            new Student("아마다", false, 1, 1, 120),
            new Student("카아라", true, 2, 2, 420),
            new Student("다가라", true, 2, 3, 320),
            new Student("파야므", true, 1, 2, 120),
            new Student("비태추", false, 2, 1, 240),
            new Student("맹푸아", true, 1, 1, 270),
            new Student("캐투퍼", false, 1, 2, 230),
            new Student("개우피", false, 2, 3, 170),
            new Student("케애그", false, 1, 1, 180),
            new Student("배애푸", true, 1, 2, 120),
            new Student("베트팔", false, 1, 1, 280),
            new Student("케트퍄", true, 2, 2, 460),
            new Student("엨프애", false, 2, 1, 470),
            new Student("대그라", true, 2, 3, 410),
        };

        System.out.printf("1. 단순 분활 ( 성별로 분할 ) %n");

        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student::isMale));
        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);

        for(Student s : maleStudent) System.out.println("남"+s);
        for(Student s : femaleStudent) System.out.println("여"+s);

        System.out.printf("2. 단순 분활 + 통계 ( 성별 학생수 ) %n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student::isMale, counting()));
        System.out.println("남 : "+ stuNumBySex.get(true));
        System.out.println("여 : "+ stuNumBySex.get(false));

        System.out.printf("3. 단순 분활 + 통계 ( 성별 1등 ) %n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, maxBy(Comparator.comparingInt(Student::getScore))));
        System.out.println("남 1등 : "+ topScoreBySex.get(true));
        System.out.println("여 1등: "+ topScoreBySex.get(false));
        Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, collectingAndThen(maxBy(Comparator.comparingInt(Student::getBan)), Optional::get)));
        System.out.println("남 1등 : "+ topScoreBySex2.get(true));
        System.out.println("여 1등: "+ topScoreBySex2.get(false));

        System.out.printf("4. 단순 분활 ( 성별 불합격자, 100점이하 ) %n");
        Map<Boolean, Map<Boolean, List<Student>>> filedStuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, partitioningBy(s->s.getScore() <= 200)));
        List<Student> failedMaleStudent = filedStuBySex.get(true).get(true);
        List<Student> failedFemaleStudent = filedStuBySex.get(false).get(true);
        for(Student s : failedMaleStudent) System.out.println("남"+s);
        for(Student s : failedFemaleStudent) System.out.println("여"+s);

        System.out.printf("5. 단순 그룹 ( 반별로 ) %n");
        Map<Integer, List<Student>> stuByBan = Stream.of(stuArr).collect(groupingBy(Student::getBan));
        for(List<Student> ban : stuByBan.values()){
            for(Student s : ban){
                System.out.println(s);
            }
        }

        System.out.printf("5. 단순 그룹 ( 성적별로 그룹 ) %n");
        Map<Student.Level, List<Student>> studByLevel = Stream.of(stuArr)
                .collect(groupingBy(s->{
                    if(s.getScore() >= 300) return Student.Level.HIGH;
                    else if(s.getScore() >= 200) return Student.Level.MID;
                    else return Student.Level.LOW;
                }));
        TreeSet<Student.Level> keySet = new TreeSet<>(studByLevel.keySet());
        for(Student.Level key : keySet){
            System.out.println("["+key+"]");
            for(Student s : studByLevel.get(key)){
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.printf("6. 단순 그룹 + 통계( 성적별 학생수 ) %n");
        Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s->{
                    if(s.getScore() >= 300) return Student.Level.HIGH;
                    else if(s.getScore() >= 200) return Student.Level.MID;
                    else return Student.Level.LOW;
                }, counting()));
        for(Student.Level key : stuCntByLevel.keySet()){
            System.out.printf("[%s] - %d명", key, stuCntByLevel.get(key));
            System.out.println();
        }

        System.out.printf("6. 다중그룹화 ( 학년별, 반별 )%n");
        Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student::getHak, groupingBy(Student::getBan)));
        for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()){
            for(List<Student> ban : hak.values()){
                System.out.println();
                for(Student s : ban){
                    System.out.println(s);
                }
            }
        }

        System.out.printf("7. 다중그룹화 ( 학년별, 반별 1등 )%n");
        Map<Integer, Map<Integer, Student>> topStuByHakAndBan =
                Stream.of(stuArr).collect(groupingBy(Student::getHak,
                        groupingBy(Student::getBan, collectingAndThen(
                                maxBy(Comparator.comparingInt(Student::getScore)), Optional::get
                        ))));
        for(Map<Integer, Student> ban : topStuByHakAndBan.values()){
            for(Student s : ban.values()){
                System.out.println(s);
            }
        }

        
        System.out.printf("7. 다중그룹화 + 통계 ( 학년별, 반별 성적 그룹 )%n");
        Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s->s.getHak()+"-"+s.getBan(),
                        mapping(s->{
                            if(s.getScore() >= 300) return Student.Level.HIGH;
                            else if(s.getScore() >= 200) return Student.Level.MID;
                            else return Student.Level.LOW;
                        }, toSet())));

        Set<String> keySet2 = stuByScoreGroup.keySet();
        for(String key : keySet2){
            System.out.println("["+key+"]"+stuByScoreGroup.get(key));
        }
    }

}

class Student {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getHak() {
        return hak;
    }

    public void setHak(int hak) {
        this.hak = hak;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level { HIGH, MID, LOW }
}

package com.example.demolearn;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-16 06:27
 **/
public class ParaTrans {
    public static void main(String[] args) {
//        Person p = new Person();
//        String[] fullname = new String[]{"Homer", "Simpson"};
//        p.setName(fullname); // 传入fullname数组
//        System.out.println(p.getName()); // "Homer Simpson"
//        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
//        System.out.println(p.getName());
        String[] s = {"tom", "daely"};
        Student student = new Student(s,10, 100);
//        System.out.println(student.getName());
        System.out.println(student);
    }
}

class Person {
    private String[] name;

    public Person(String[] name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

class Student extends Person {
    public int age;
    public int score;

    public Student() {
        super();
    }


    @Override
    public String toString() {
        return "Student{" +
            "age=" + age +
            ", score=" + score +", name="+
            super.getName()+
            '}';
    }

    public Student(String[] name, int age, int score) {
        super(name);
        this.age = age;
        this.score = score;
    }

    public Student(int age, int score) {
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

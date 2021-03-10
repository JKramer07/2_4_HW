package com.company;

public class Main {

    public static void main(String[] args) {

        Course<Math> mathCourse = new Course<>();
        Math math = new Math();
        mathCourse.setSubject(math);
        mathCourse.tasks(math);

        Course<Geography> geographyCourse = new Course<>();
        Geography geography = new Geography();
        geographyCourse.setSubject(geography);
        geographyCourse.tasks(geography);

        Course<Biology> biologyCourse = new Course<>();
        Biology biology = new Biology();
        biologyCourse.setSubject(biology);
        biologyCourse.tasks(biology);
    }
}

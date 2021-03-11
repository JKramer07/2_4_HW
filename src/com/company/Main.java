package com.company;


import java.util.ArrayList;
import java.util.List;

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

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject());

        List<Math> mathList = new ArrayList<>();
        mathList.add(new Math());

        List<Geography> geographyList = new ArrayList<>();
        geographyList.add(new Geography());

        List<Biology> biologyList = new ArrayList<>();
        biologyList.add(new Biology());

        toDoListOfCourses(subjectList);
        toDoListOfCourses(mathList);
        toDoListOfCourses(geographyList);
        toDoListOfCourses(biologyList);
    }

    public static void toDoListOfCourses(List<? extends Subject> list){
        for(Subject subject : list){
            subject.callTheme();
        }
    }
}

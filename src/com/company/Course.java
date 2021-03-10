package com.company;

public class Course <Q extends Subject> implements Taskable<Subject>{

    private Q subject;

    public Course(Q subject) {
        this.subject = subject;
    }
    public Course(){}

    public Q getSubject(){
        return subject;
    }
    public void setSubject(Q subject){
        this.subject = subject;
    }


    @Override
    public void tasks(Subject subject) {
        System.out.println(subject.getClass().getSimpleName());
    }

    @Override
    public Subject tasks() {
        return subject;
    }
}

package com.company;

public interface Taskable <Q>{

    void tasks(Q q);

    Q tasks();
}

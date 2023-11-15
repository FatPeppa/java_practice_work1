package practice_20.task2.controller;

import practice_20.task2.View;

public interface Controller<T> {

    void addCharacter(String number);

    void clear();

    void calculate();

    void setView(View<T>view);

    void eraseLast();
}

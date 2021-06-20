package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<Integer> studentGradeList = new ArrayList<>();
        int indexOfMaxElement = 0;
        for (int i = 0; i < 5; i++) {
            studentGradeList.add(ThreadLocalRandom.current().nextInt(0, 11));
        }
        System.out.println("Все оценки: " + studentGradeList);

        for (int i = 1; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i) > studentGradeList.get(indexOfMaxElement)) {
                indexOfMaxElement = i;
            }
        }
        System.out.println("Самая высокая оценка: " + studentGradeList.get(indexOfMaxElement));
    }
}
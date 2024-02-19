package com.epam.mjc.collections.list;

import java.util.*;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(0, num);
            }
        }

        oddList.addAll(evenList);

        return oddList;
    }
}

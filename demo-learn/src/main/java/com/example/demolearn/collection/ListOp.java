package com.example.demolearn.collection;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-05 21:43
 **/
public class ListOp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<Person, Integer> treeMap = new TreeMap<>();
        HashSet<String> set = new HashSet<>();
        Queue<Person> queue = new LinkedBlockingQueue<>();
        queue.offer(new Person("", "", 10));
        map.put("a", 100);
        map.put("b", 100);
        map.put("c", 100);
        treeMap.put(new Person("jasper", "steel", 10), 10);
        treeMap.put(new Person("karl", "steel", 10), 10);
        treeMap.put(new Person("allen", "steel", 10), 10);
        treeMap.put(new Person("amy", "steel", 10), 10);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry<Person, Integer> entry : treeMap.entrySet()) {
            System.out.println("["+entry.getKey().firstName + ":" + entry.getValue()+"]");
        }
        arrayList.add("jasper");
        arrayList.add("jasper1");
        arrayList.add("jasper2");
        linkedList.add("karl");
        linkedList.add("karl1");
        linkedList.add("karl2");
        linkedList.add("karl3");
        System.out.println(arrayList);
        System.out.println(linkedList);

    }
}


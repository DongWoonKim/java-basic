package com.example.security;

// * Set
// 중복되지 않는 요소들의 집합을 나타냅니다.
// Set 인터페이스를 구현하는 대표적인 클래스에는 HashSet, TreeSet, LinkedHashSet 등이 있다.
// Set은 요소의 순서를 보장하지 않으며, 각 요소는 고유하다.

// * 주요 특징
//	•	중복 허용 안함: Set은 동일한 요소가 두 번 이상 포함될 수 없다.
//	•	순서 보장 안함: 일반적으로 요소의 삽입 순서를 보장하지 않지만, 일부 구현체(LinkedHashSet)는 순서를 유지할 수 있다.
//	•	빠른 검색: Set은 특정 요소가 존재하는지 빠르게 검색할 수 있다.

// * 주요 메소드
//	•	add(E e): 집합에 요소를 추가합니다. 중복된 요소가 추가되면 추가되지 않는다.
//	•	remove(Object o): 특정 요소를 제거한다.
//	•	contains(Object o): 집합에 특정 요소가 포함되어 있는지 확인한다.
//	•	size(): 집합의 요소 개수를 반환한다.
//	•	clear(): 집합의 모든 요소를 제거한다.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// * 요약
//	•	HashSet은 요소의 순서를 보장하지 않으며, 빠른 성능을 제공한다.
//	•	TreeSet은 요소를 자동으로 정렬하며, 정렬된 순서로 요소를 유지한다.
public class A_collections_set {

    // 1. HashSet
    // 설명
    //	•	해시 기반: HashSet은 내부적으로 해시맵(HashMap)을 사용하여 요소를 저장한다.
    //	•	빠른 성능: 요소의 추가, 삭제, 검색이 평균적으로 O(1)의 시간 복잡도를 가진다.
    //	•	순서 없음: 요소의 순서를 보장하지 않는다.
    public void exam1() {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // 중복된 요소, 추가되지 않음

        System.out.println("HashSet elements: " + hashSet);

        hashSet.remove("Banana");
        System.out.println("After removing Banana: " + hashSet);

        boolean containsApple = hashSet.contains("Apple");
        System.out.println("Does HashSet contain Apple? " + containsApple);

        // 순회 방법 1: 향상된 for 루프 사용
        for (String element : hashSet) {
            System.out.println("Element: " + element);
        }

        // 순회 방법 2: Iterator 사용
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
    }

    // 2. TreeSet
    // 설명
    //	•	이진 검색 트리 기반: TreeSet은 내부적으로 TreeMap을 사용하여 요소를 저장합니다.
    //	•	정렬된 순서: 요소가 자동으로 오름차순으로 정렬됩니다.
    //	•	성능: 요소의 추가, 삭제, 검색이 O(log n)의 시간 복잡도를 가집니다.
    public void exam2() {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grape");

        System.out.println("TreeSet elements: " + treeSet);

        treeSet.remove("Apple");
        System.out.println("After removing Apple: " + treeSet);

        String firstElement = ((TreeSet<String>) treeSet).first();
        System.out.println("First element: " + firstElement);

        String lastElement = ((TreeSet<String>) treeSet).last();
        System.out.println("Last element: " + lastElement);

        // 순회 방법 1: 향상된 for 루프 사용
        for (String element : treeSet) {
            System.out.println("Element: " + element);
        }

        // 순회 방법 2: Iterator 사용
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

    }

    public static void main(String[] args) {

    }
}

package com.example.security;

// * 정적메서드
// 클래스 메서드는 자바에서 static 키워드로 선언된 메서드를 의미하며, 이는 정적 메서드라고도 불립니다.
// 정적 메서드는 특정 클래스의 인스턴스에 종속되지 않으며, 클래스 자체에 속합니다.
// 따라서 객체를 생성하지 않고도 클래스 이름을 통해 직접 호출할 수 있습니다.
// 클래스 메서드도 클래스변수처럼, 객체를 생성하지 않고도 '클래스이름.메서드이름'와 같은 식으로 호출 가능하다.

// * 주요 특징
// 1.인스턴스 필요 없음: 정적 메서드는 클래스 이름으로 직접 호출할 수 있으며, 객체를 생성할 필요가 없습니다.
// 2.정적 변수와 상수만 접근 가능: 정적 메서드는 클래스의 다른 정적 멤버(정적 변수 또는 다른 정적 메서드)와만 상호작용할 수 있습니다.
// 인스턴스 변수나 인스턴스 메서드에는 직접 접근할 수 없습니다.
// 3.유틸리티 메서드로 자주 사용: 자주 사용되거나 공통적인 작업을 수행하는 유틸리티 메서드는 일반적으로 정적 메서드로 구현됩니다.
// 예를 들어, Math 클래스의 Math.sqrt() 메서드처럼 인스턴스와 관련이 없는 계산 작업을 수행하는 경우가 많습니다.

// * 결론
//	•	정적 메서드는 클래스에 속하는 메서드로, 특정 인스턴스와 관계없이 호출할 수 있습니다.
//	•	주로 유틸리티 성격의 메서드나, 클래스 자체의 특성과 관련된 기능을 제공하는 메서드를 정의할 때 사용됩니다.
//	•	인스턴스 변수를 사용하지 않고, 클래스 차원에서 공통으로 사용할 수 있는 기능을 제공할 때 유용합니다.
class MathOperations {
    // 정적 변수
    static final double PI = 3.14159;

    // 정적 메서드
    static double add(double a, double b) {
        return a + b;
    }

    // 정적 메서드
    static double multiply(double a, double b) {
        return a * b;
    }

    // 정적 메서드
    static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class D_static_method {
    public static void main(String[] args) {
        // 정적 메서드는 클래스 이름을 통해 직접 호출할 수 있음
        double sum = MathOperations.add(5, 10);
        double product = MathOperations.multiply(4, 6);
        double area = MathOperations.circleArea(7);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Area of circle: " + area);
    }
}

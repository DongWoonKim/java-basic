package com.example.java;

// * 오버로딩(Overloading)
// 같은 이름의 메서드를 여러 개 정의할 수 있게 해주는 자바의 기능입니다.
// 단, 이 메서드들은 매개변수의 타입, 개수, 또는 순서가 달라야 합니다.
// 메서드 오버로딩은 같은 기능을 수행하지만 입력이 다른 경우에 사용되며,
// 이를 통해 코드의 가독성과 유지보수성을 높일 수 있습니다.

// * 오버로딩의 규칙
// 	1.	매개변수의 타입: 매개변수의 데이터 타입이 다르면 오버로딩이 가능합니다.
//	2.	매개변수의 개수: 매개변수의 개수가 다르면 오버로딩이 가능합니다.
//	3.	매개변수의 순서: 매개변수의 타입이 다를 경우, 그 순서를 바꿔서 오버로딩할 수 있습니다.

// 주의: 반환 타입이 다르다고 해서 오버로딩이 성립하는 것은 아닙니다.
// 즉, 매개변수 목록이 동일하지만 반환 타입만 다른 메서드는 오버로딩으로 간주되지 않으며, 컴파일 오류가 발생합니다.

// 오버로딩의 장점
//	•	코드의 가독성: 같은 이름의 메서드를 사용해 다양한 입력을 처리할 수 있어 코드가 직관적입니다.
//	•	유지보수 용이성: 관련된 작업을 수행하는 메서드를 같은 이름으로 그룹화하여 코드를 유지 관리하기 쉽게 합니다.
//	•	다형성(Polymorphism): 컴파일 시점에서 적절한 메서드를 선택하는 컴파일타임 다형성을 제공합니다.

// 오버로딩은 자바에서 메서드를 유연하고 효율적으로 사용하는 중요한 기법입니다.
// 동일한 작업을 수행하되, 입력 형태에 따라 조금씩 다른 동작을 요구할 때 유용하게 사용됩니다.

class Calculator {
    // 두 정수의 합을 반환하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 세 정수의 합을 반환하는 메서드 (매개변수 개수가 다름)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 여러 개의 정수를 더하는 메서드 (가변인자 사용)
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 두 실수의 합을 반환하는 메서드 (매개변수 타입이 다름)
    public double add(double a, double b) {
        return a + b;
    }

    // 두 정수의 곱을 반환하는 메서드 (매개변수 타입이 다름)
    public int multiply(int a, int b) {
        return a * b;
    }

    // 두 실수의 곱을 반환하는 메서드 (매개변수 타입이 다름)
    public double multiply(double a, double b) {
        return a * b;
    }
}

public class E_overloading {
    public static void main(String[] args) {
        Calculator math = new Calculator();

        // 정수 덧셈
        System.out.println("Sum of two integers: " + math.add(10, 20));
        System.out.println("Sum of three integers: " + math.add(10, 20, 30));
        System.out.println("Sum of five integers: " + math.add(1, 2, 3, 4, 5));

        // 실수 덧셈
        System.out.println("Sum of two doubles: " + math.add(10.5, 20.5));

        // 정수 곱셈
        System.out.println("Product of two integers: " + math.multiply(10, 20));

        // 실수 곱셈
        System.out.println("Product of two doubles: " + math.multiply(10.5, 20.5));
    }
}

package com.example.security;

// * 변수와 메서드
// 1. 인스턴스변수(Instance variable)
// 클래스 영역에 선언되면, 클래스의 인스턴스를 생성할 때 만들어진다.

// 2. 클래스변수(Class variable)
// 클래스변수를 선언하는 방법은 인스턴스변수 앞에 static을 붙이기만 하면 된다.
// 클래스변수는 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.
// 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우, 클래스변수로 선언해야 한다.
// 클래스변수는 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있다.
// 클래스가 메모리에 '로딩'될 때 생성되어 프로그램이 종료될 때 까지 유지되며,
// public을 붙이면 같은 프로그램 내에서 어디서나 접근할 수 있는 '전역변수'의 성격을 갖는다.
// '클래스이름.클래스변수'

// 3. 지역변수(Local variable)
// 메서드 내에 선언되어 메서드 내에서만 가능하며, 메서드가 종료되면 소멸되어 사용할 수 없게 된다.
// {}블럭을 벗어나면 소멸되어 사용할 수 없게 된다.

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 200;
}

public class B_variable {
    public static void main(String[] args) {
        System.out.println("Card.width : " + Card.width);
        System.out.println("Card.height : " + Card.height);

        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 4;
        System.out.println(c1.kind + " : " + c1.number);

        Card c2 = new Card();
        c2.kind = "Club";
        c2.number = 3;
        System.out.println(c2.kind + " : " + c2.number);

        // 모두 같은 저장공간을 참조하므로 항상 같은 값을 갖게 된다.
        System.out.println(c1.width + " : " + c1.height);
        System.out.println(c2.width + " : " + c2.height);
    }
}

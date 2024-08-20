package com.example.security;

// * 객체지향 프로그래밍(Object-Oriented Programming, OOP)
// 프로그램을 여러 개의 객체(Object)로 나누어 작성하는 방법을 말한다.
// 객체지향 프로그래밍은 코드의 재사용성과 유지보수성을 높이고,
// 복잡한 문제를 쉽게 해결할 수 있도록 하는 데 중점을 둔다.

// * class
// 객체를 정의해 놓은 것.
// 클래스는 객체를 생성하는데 사용.

// * 객체
// 실제로 존재하는 것. 사물 또는 개념.

// * 인스턴스
// 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 하며,
// 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다.
// 클래스 --(이스턴스화)--> 인스턴스(객체)

class TV {
    // TV의 속성 -> 멤버 변수
    String color;
    boolean power;
    int volume;
    int channel;

    // TV의 기능 -> 메서드
    public void power() {
        power = !power;
        System.out.println("TV전원을 " + (power ? "켰다" : "껐다"));
    }

    public void volumeUp() {
        volume++;
        System.out.println("볼륨을 올렸다.");
    }

    public void volumeDown() {
        if (volume < 1) {
            volume = 1;
        }
        volume--;
        System.out.println("볼륨을 내렸다.");
    }

    public void channelUp() {
        channel++;
        System.out.println("채널을 올렸다.");
    }

    public void channelDown() {
        if (channel < 1) {
            channel = 1;
        }
        channel--;
        System.out.println("채널을 내렸다.");
    }

}

public class A_object_class {
    public static void main(String[] args) {

        // 객체 생성
        TV tv = new TV();

        tv.channel = 7;
        tv.color = "black";
        tv.power = false;
        tv.volume = 8;

        tv.power();
        tv.volumeUp();
        tv.channelDown();
    }
}
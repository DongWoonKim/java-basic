package com.example.java;

// * 스레드 그룹
// 스레드 그룹은 서로 연관된 스레드를 그룹으로 다루기 위한 것으로,
// 폴더를 생성해서 관련된 파일들을 함께 넣어서 관리하는 것처럼 스레드 그룹을 생성해서 스레드를 그룹으루 묶어서 관리할 수 있다.

// 자바 어플리케이션이 실행되면, JVM은 main과 system이라는 스레드 그룹을 만들고 JVM운영에 필요한 스레드들을 생성해서 이 스레드 그룹에 포함시킨다.
// 우리가 생성하는 모든 스레드 그룹은 main스레드 그룹의 하위 스레드 그룹이 되며,
// 스레드 그룹을 지정하지 않고 생성한 스레드는 자동적으로 main스레드 그룹에 속하게 된다.

// ThreadGroup getThreadGroup() : 스레드 자신이 속한 스레드 그룹을 반환한다.
// void uncaughtException(Thread t, Throwable e) : 스레드 그룹의 스레드가 처리되지 않은 예외에 의해 실행이 종료되었을 때, JVM에 의해 자동으로 호출된다.

public class C_thread_5_group {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup group1 = new ThreadGroup("Group1");
        ThreadGroup group2 = new ThreadGroup("Group2");

        ThreadGroup subGroup1 = new ThreadGroup(group1, "SubGroup1");

        group1.setMaxPriority(3);

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Thread(ThreadGroup tg, Runnable r, String name)
        new Thread(group1, runnable, "th1").start();
        new Thread(subGroup1, runnable, "th2").start();
        new Thread(group2, runnable, "th3").start();

        System.out.println(">>List of ThreadGroup : " + main.getName() + ", Active ThreadGroup : " + main.activeGroupCount() + ", Active Thread : " + main.activeCount());
        main.list(); // main스레드 그룹의 정보를 출력
    }
}

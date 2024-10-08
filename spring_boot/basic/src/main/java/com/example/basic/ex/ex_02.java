package com.example.basic.ex;

// * 제어의 역전 - IoC(Inversion Of Control)

// * 의존성 주입 - DI?(Dependency Injection)
// 스프링에서는 객체들을 관리하기 위해 제어의 역전을 사용한다.
// 그리고 제어의 역전을 구현하기 위해 사용하는 방법이 DI이다.
// 어떤 클래스가 다른 클래스에 의존한다는 뜻이다.

// * 서블릿 컨테이너(Servlet Container)
// 개요
// * 서블릿 컨테이너(Servlet Container)
// 자바 서블릿(Servlet)을 실행하고 관리하는 역할을 하는 서버 환경이다.
// 서블릿은 자바로 작성된 웹 애플리케이션의 서버 측 컴포넌트로,
// HTTP 요청을 처리하고, 동적 웹 콘텐츠를 생성하는 데 사용된다.
// 서블릿 컨테이너는 이러한 서블릿의 생명 주기와 요청/응답 처리, 그리고 다양한 웹 관련 기능을 관리한다.

// ** 주요 역할
//	•	서블릿 생명 주기 관리: 서블릿 컨테이너는 서블릿의 생성, 초기화, 서비스, 소멸 등의 생명 주기를 관리한다.
//	서블릿이 처음 요청될 때 컨테이너는 해당 서블릿의 인스턴스를 생성하고 초기화한다.
//	•	요청/응답 처리: 서블릿 컨테이너는 클라이언트로부터 HTTP 요청을 받아 적절한 서블릿으로 전달하고,
//	서블릿이 생성한 HTTP 응답을 클라이언트에게 반환한다.
//	•	스레드 관리: 서블릿 컨테이너는 다중 스레드를 사용하여 다수의 클라이언트 요청을 병렬로 처리한다.
//	각 클라이언트 요청은 별도의 스레드에서 처리되며, 이는 동시에 여러 요청을 처리할 수 있도록 한다.
//	•	보안 관리: 서블릿 컨테이너는 웹 애플리케이션의 보안 설정(예: 인증, 권한 부여)을 관리한다.
//	예를 들어, 특정 URL에 대한 접근을 제어하거나, HTTPS를 통해 보안 통신을 처리한다.
//	•	JSP 지원: 서블릿 컨테이너는 자바 서버 페이지(JSP)도 처리할 수 있다.
//	JSP는 서블릿으로 변환되어 실행되며, 서블릿 컨테이너가 이 변환 과정을 처리한다.

// * 스프링 컨테이너(Spring Container)
// 스프링 프레임워크의 핵심 요소로, 애플리케이션의 객체(빈, Bean)를 관리하고 의존성 주입(Dependency Injection)을 통해 객체 간의 관계를 설정하는 역할을 한다.
// 스프링 컨테이너는 애플리케이션의 객체 생성, 초기화, 설정, 생명 주기 관리 등을 담당하며,
// 이러한 작업을 통해 애플리케이션의 구성 요소들을 효과적으로 관리할 수 있다.

// * 주요 역할
//	•	의존성 주입(Dependency Injection, DI): 스프링 컨테이너는 객체 간의 의존성을 관리하고, 필요한 의존성을 자동으로 주입한다.
//	이는 객체 간의 결합도를 낮추고, 애플리케이션의 유지보수성과 테스트 용이성을 높인다.
//	•	빈 관리: 스프링 컨테이너는 애플리케이션에 필요한 객체(빈)를 생성하고, 이러한 빈들을 애플리케이션에서 사용할 수 있도록 관리한다.
//	빈은 스프링 설정 파일이나 애노테이션을 통해 정의된다.
//	•	빈 생명 주기 관리: 스프링 컨테이너는 빈의 생성, 초기화, 소멸 등의 생명 주기를 관리한다.
//	개발자는 특정 메서드를 정의하여 빈의 초기화나 소멸 시점에 필요한 작업을 수행할 수 있다.
//	•	AOP 지원: 스프링 컨테이너는 애스펙트 지향 프로그래밍(AOP)을 지원한다.
//	이를 통해 개발자는 트랜잭션 관리, 보안, 로깅 등의 횡단 관심사를 비즈니스 로직과 분리하여 관리할 수 있다.
//	•	다양한 컨테이너 종류: 스프링에는 여러 종류의 컨테이너가 있으며, 대표적으로 BeanFactory와 ApplicationContext가 있다.
//	•	BeanFactory: 가장 기본적인 컨테이너로, 기본적인 DI 기능만 제공하며, 지연 로딩(Lazy Loading)을 지원한다.
//	•	ApplicationContext: BeanFactory의 모든 기능을 포함하며, AOP, 이벤트 전파, 메시지 리소스 처리 등 다양한 부가 기능을 제공한다.

// 관점지향?, PSA?

// Http?
// Rest API?

public class ex_02 {
}

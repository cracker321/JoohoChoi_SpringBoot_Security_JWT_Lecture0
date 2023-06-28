package com.cos.security1.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
< 오버라이딩 @Overriding >

# 개념
- 상속 관계에서, 부모 클래스 또는 부모 인터페이스에서 정의된 메소드를, 자식 클래스에서 재정의하는 것.
  자식 클래스는 부모 클래스의 메소드를 자신의 목적에 맞게 구현할 수 있음.

# 오버로딩(Overloading)과의 차이
- 오버로딩은, 같은 클래스 내에서 동일한 이름의 메소드를 다른 매개변수로 정의하는 것임.
- 오버라이딩은, 상속 관계에서, 부모 클래스 또는 부모 인터페이스에서 정의된 메소드를, 자식 클래스에서 재정의하는 것임.

# 사용되는 상황
- 부모 클래스 또는 부모 인터페이스의 기능을 수정하거나 추가적인 동작을 구현해야 할 때.
- 다형성을 구현하고 메소드의 동작을 동적으로 결정해야 할 때.
- 부모 인터페이스에서 구현해야 하는 메소드가 있을 때, 해당 인터페이스를 구현한 클래스에서 메소드를 재정의할 때

# 예제



 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    //===========================================================================================

    //[ '스프링부트 시큐리티 1강 - 환경설정'강 00:00~ ]


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        WebMvcConfigurer.super.configureViewResolvers(registry);
    }
}

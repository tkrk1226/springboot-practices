package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex04.component.MyComponent;

/*
 * @SpringBootApplication : 메타 어노테이션
 * 
 * + @SpringBootConfiguration (cf. @Configuration)
 * + @ComponentScan (하위 구조...)
 * + @EnableAutoConfiguration (웹 MVC 설정, AOP, Security, JPA,... 등을 자동 default 설정 on Dependency)
 * 
 * Container -> Auto Configure -> Annotation <- 미세설정 - properties에 설정(ViewResolver(user/login), ...)
 * 
 */

@SpringBootApplication
public class MyApplication {
	
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {

		}
	}
}

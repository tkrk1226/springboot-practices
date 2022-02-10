package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 
 * BootStrapping Class
 * 
 * 1. 스프링부트 애플리케이션의 부트스트래핑 (Bootstrapping)
 * 2. 설정 클래스로 역할(Configuration Class)
 * 
 * 
 * 
 */

public class HelloWorldApplication {

	/*
	 * 
	 * 1. 애플리케이션 컨텍스트 (Application Context, Spring Container) 생성
	 * 2. 웹 어플리케이션 타입 결정(Web Application 인 경우, MVC or Reactive 타입 결정)
	 * 3. 어노테이션 스캐닝(auto) or Configuration Class(Explicit) 통한 빈 생성 / 등록 및 Wiring 작업
	 * 4. 웹 어플리캐이션(MVC) - WAS를 버릴 수 있게 됨.
	 * 	- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
	 *  - 서버 인스턴스 웹 어플리케이션을 배포
	 *  - 서버 인스턴스를 실행
	 * 5. ApplicationRunner 인터페이스 구현한 빈을 찾아서 실행(run 호출)
	 *  - main에 직접 쓰지 말고 HelloWorld(원하는 기능)를 빈으로 등록해서 사용해야한다. (Spring 사용의 이유)
	 * 
	 */
	
	public static void main(String[] args) {
		// ApplicationContext container close? interface이기 때문에 close method가 없음
		// ConfigurableApplicationContext 를 쓰는데 runtime Exception이 나옴

//		ConfigurableApplicationContext c = null;
//		
//		try {
//			c = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
//		try ~ with ~ resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
				
	}
}
